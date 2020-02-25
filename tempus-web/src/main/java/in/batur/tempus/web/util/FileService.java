package in.batur.tempus.web.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
 
@Component
public class FileService 
{
	Logger logger = LoggerFactory.getLogger(FileService.class);
	
	@Value("${tempus.tempus-front-files}")
	private String rootFileDirectory;
 
	public void storeCompanyLogo(MultipartFile file) throws IOException 
	{
		Path filePath = Paths.get(rootFileDirectory + "/companylogo/" + "companylogo.png");
		Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
	}
}