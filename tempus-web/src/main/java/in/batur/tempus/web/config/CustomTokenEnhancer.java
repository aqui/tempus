package in.batur.tempus.web.config;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import in.batur.tempus.entity.UserDetailsImpl;

public class CustomTokenEnhancer implements TokenEnhancer 
{
	Logger logger = LoggerFactory.getLogger(CustomTokenEnhancer.class);
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) 
	{
		UserDetailsImpl userDetail = (UserDetailsImpl)authentication.getPrincipal();
		Map<String, Object> additionalInfo = new HashMap<>();
		additionalInfo.put("organization", "tempus");
		additionalInfo.put("id", userDetail.getId());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
		return accessToken;
	}
}
