package com.secretsanta.mailImplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class SecretSantaApplication {

	public static void main(String[] args){
		Service service = new Service();

		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Andrei");
		listOfNames.add("Adelina");
		listOfNames.add("Madalin");
		List<String> listOfEmails = new ArrayList<>();
		listOfEmails.add("andreihga@gmail.com");
		listOfEmails.add("andrei.adrian.hogea@gmail.com");
		listOfEmails.add("hogik00@gmail.com");


		ApplicationContext ctx = SpringApplication.run(SecretSantaApplication.class,args);
		MailService mailService = (MailService) ctx.getBean("mailService");
		mailService.sendMail(service.businessLogic(listOfNames,listOfEmails));
	}

}
