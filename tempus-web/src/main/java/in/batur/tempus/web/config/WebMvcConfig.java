package in.batur.tempus.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer 
{
	Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);
	
	@Value("${tempus.tempus-front-files}")
	private String tempusFrontFiles;
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) 
    {
    	registry.addResourceHandler("/tempus-front-files/**")
		    	.addResourceLocations("file:"+tempusFrontFiles).resourceChain(true)
		        .addResolver(new PathResourceResolver());
    }
}