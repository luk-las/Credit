package MainPack;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		return "handleException";
	}
}
