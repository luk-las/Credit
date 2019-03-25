package MainPack;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("MainPack")
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp();
	}
}
 