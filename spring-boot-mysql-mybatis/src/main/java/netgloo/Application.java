package netgloo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages ="netgloo.mapper")
public class Application extends WebMvcConfigurerAdapter {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
