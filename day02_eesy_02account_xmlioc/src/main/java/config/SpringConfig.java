package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

/**
 * @Author: SongJunHui
 * email:1097772818@qq.com
 * blog: https://blog.csdn.net/s4742488
 * @Date: 2019/5/26 19:42
 */
@ContextConfiguration
@ComponentScan("com.itheima")
@Import(BeanFactory.class)
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
