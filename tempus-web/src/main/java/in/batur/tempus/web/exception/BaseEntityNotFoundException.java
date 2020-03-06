package in.batur.tempus.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BaseEntityNotFoundException extends RuntimeException 
{
	private static final long serialVersionUID = 1L;

	public BaseEntityNotFoundException(String message) 
	{
		super(message);
	}
}