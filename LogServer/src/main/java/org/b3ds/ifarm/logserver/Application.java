package org.b3ds.ifarm.logserver;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public void setPortNo(String port)
	{
		SpringApplication application = new SpringApplication(Application.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", port));
		application.run();
	}
	
    public static void main(String[] args) {
      
    	Application app = new Application();
    	app.setPortNo("8081");
    	
    }
}