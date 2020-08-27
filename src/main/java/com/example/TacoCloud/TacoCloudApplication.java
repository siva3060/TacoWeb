package com.example.TacoCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication = @EnableAutoConfiguration + @ComponentScan + @SpringBootConfiguration
 *
 * @SpringBootConfiguration :
 * 	A specialised form of configuration class, picked up by spring framework.This class has the 
 * 	configuration details of the sping application 
 *
 * @ComponentScan :
 *  	Scans all the classes in the classpath and these classes are registered into the spring
 *  	application context 
 *
 *  @EnableAutoConfiguration :
 */	

@SpringBootApplication
public class TacoCloudApplication {

	/*	When springboot application runs the jar file since this class is marked with @SpringBootApplication it will try to execute the main method in this clas */

	public static void main(String[] args) {
		/* As soon as the main method is called it will run an static run method from
		 * SpringApplication class called run 
		 * 	This run method is responsible to create the spring application context/Spring
		 * 	container
		 *
		 * 	This method takes 2 arguments 
		 * 	1.Configuration class for the whole application 
		 * 	2.Any command line arugments passed to the main method 
		 */
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
