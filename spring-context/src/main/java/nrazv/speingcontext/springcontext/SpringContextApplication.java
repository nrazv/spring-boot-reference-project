package nrazv.speingcontext.springcontext;

import nrazv.speingcontext.springcontext.user.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringContextApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringContextApplication.class, args);

		UserController userController = (UserController) applicationContext.getBean("userController");
		userController.printUser();

		// NOTE: The name of Spring Bean in ApplicationContext by default will be the class name with a lowercase

		UserController userControllerB =  applicationContext.getBean(UserController.class);
		userControllerB.printUser();
	}

}
