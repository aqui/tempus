package in.batur.tempus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TempusWebMain 
{
	public static Logger logger = LoggerFactory.getLogger(TempusWebMain.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TempusWebMain.class, args);
		logger.info("TEMPUS started with context ID: "+applicationContext.getId());
	}
}
