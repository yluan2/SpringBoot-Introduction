package com.springBoot.intro.springbootintro;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//spring context
//enable auto configuration
//Component scan -> important feature
public class SpringbootIntroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =  
				SpringApplication.run(SpringbootIntroApplication.class, args);
		//SpringbootIntroApplication  -> Spring context
		
		for(String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
