package springmvc_webapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springmvc_webapp.controller")
public class WebMvcConfig {

}
