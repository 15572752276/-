package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @Author: SongJunHui
 * email:1097772818@qq.com
 * blog: https://blog.csdn.net/s4742488
 * @Date: 2019/5/26 19:33
 */
@Component
@PropertySource("classpath:jdbc.properties")
public class BeanFactory {

    @Value("${jdbcUrl}")
    String jdbcUrl;
    @Value("${user}")
    String user;
    @Value("${password}")
    String password;
    @Value("${jdbcDriver}")
    String jdbcDriver;

    @Bean("runner")
    public QueryRunner queryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }


    @Bean("dataSource")
    public DataSource dataSource() throws Exception{

        ComboPooledDataSource cp = new ComboPooledDataSource();
        cp.setPassword(password);
        cp.setUser(user);
        cp.setJdbcUrl(jdbcUrl);
        cp.setDriverClass(jdbcDriver);
        return cp;
    }

}
