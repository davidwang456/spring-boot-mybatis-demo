package sample.mybatis.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
/**
 * PasswordEncoderConfig
 * 
 * @author vladimir.stankovic
 *
 * Dec 27, 2016
 */
@Configuration
public class DataSourceConfig {
    @Bean
    protected DataSource dataSource() {
    	DataSourceFactory factory=new PooledDataSourceFactory();
    	Properties props=new Properties();
    	props.setProperty("driver", "com.mysql.jdbc.Driver");
    	props.setProperty("url", "jdbc:mysql://localhost/test");
    	props.setProperty("username", "root");
    	props.setProperty("password", "root");
    	factory.setProperties(props);
        return factory.getDataSource() ;
    }
}
