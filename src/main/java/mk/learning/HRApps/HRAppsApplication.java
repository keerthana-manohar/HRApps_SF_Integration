package mk.learning.HRApps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mk.learning.HRApps.*")
public class HRAppsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HRAppsApplication.class, args);

	}

}
