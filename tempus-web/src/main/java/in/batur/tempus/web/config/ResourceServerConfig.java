package in.batur.tempus.web.config;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

/**
 * The @EnableResourceServer annotation adds a filter of type
 * OAuth2AuthenticationProcessingFilter automatically to the Spring Security
 * filter chain.
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter 
{
	Logger logger = LoggerFactory.getLogger(ResourceServerConfig.class);

	@Override
	public void configure(HttpSecurity http) throws Exception 
	{
		// TODO: Custom login page is needed
		http.headers()
			.frameOptions()
			.disable()
			.and()
			.csrf()
			.disable()
			.authorizeRequests()
			.antMatchers("/oauth/token", "/swagger-resources/**", "/v2/api-docs", "/h2-console/**")
			.permitAll()
			.anyRequest()
			.authenticated();
		http.addFilterBefore(new CorsFilter(), ChannelProcessingFilter.class);
		http.addFilterAfter(new CorsFilter(), ChannelProcessingFilter.class);
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> getExtraInfo(Authentication auth) 
	{
		OAuth2AuthenticationDetails oauthDetails = (OAuth2AuthenticationDetails) auth.getDetails();
		return (Map<String, Object>) oauthDetails.getDecodedDetails();
	}
}