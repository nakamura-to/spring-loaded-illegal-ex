package sample;

import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.UtilLoggingJdbcLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    @Bean
    public JdbcLogger jdbcLogger() {
        return new UtilLoggingJdbcLogger();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
