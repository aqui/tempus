package in.batur.tempus.web.resource.api;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.batur.tempus.web.util.FileService;

@RestController
@RequestMapping(value = "/api/fileupload")
public class FileController 
{
	Logger logger = LoggerFactory.getLogger(FileController.class);
	
	@Autowired
	private FileService fileService;
	
	@PostMapping(value = "/companylogo")
	public void companyLogoUpload(@RequestParam("imageFile") MultipartFile file) throws IOException
	{
		fileService.storeCompanyLogo(file);
	}
}