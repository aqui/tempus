package in.batur.tempus.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final String FILE_DIRECTORY = "/home/aqui/angular_workspace/tempus-front/src/assets/companylogo";
 
	public void storeCompanyLogo(MultipartFile file) throws IOException 
	{
		Path filePath = Paths.get(FILE_DIRECTORY + "/" + file.getOriginalFilename());
		Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
	}
}