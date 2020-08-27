package TacoCloud

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 *  Once the Configuration class is loaded into the application context from the run method 
 *  as our main method class is annoted as springapplication which is an configuration class
 *  it will start to scan components in the package
 *
 *  This @Controller is essentially an component/Spring bean which is picked up by component scan and 
 *  registered as spring component into the applicaiton context 
 */

@Controller
public class HomeController{

	/*	The get mapping is an annotation related to the controller class of spring 
	 *	by using reflections and the argument passed to the annotations
	 *
	 *	It will guess what kind of request & request path and will redirect the 
	 *	request to the particular method 
	 */

	@GetMapping("/")
	public String home(){
		return "Home";
	}
}
