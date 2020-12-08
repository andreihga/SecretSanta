package com.secretsanta.mailImplementation;

import com.secretsanta.mailImplementation.Mail;
import com.secretsanta.mailImplementation.MailService;
import com.secretsanta.mailImplementation.MailServiceImpl;
import com.sun.glass.ui.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Random;


public class Service {

    @Autowired
    MailServiceImpl mailService = new MailServiceImpl();

    public Mail businessLogic(List<String> arrayOfFriendsNames, List<String> arrayOfFriendsEmails) {


        Mail mail = new Mail();
        Random random = new Random();
        String nameOfFriend = arrayOfFriendsNames.get(random.nextInt(arrayOfFriendsNames.size()));
        String emailOfFriend = arrayOfFriendsEmails.get(random.nextInt(arrayOfFriendsEmails.size()));
        mail.setMailFrom("andrei.adrian.hogea@gmail.com");
        mail.setMailTo(emailOfFriend);
        mail.setSubject("Secret Santa");
        mail.setContent(nameOfFriend);

        mailService.sendMail(mail);

        arrayOfFriendsEmails.remove(emailOfFriend);
        arrayOfFriendsNames.remove(nameOfFriend);
        return mail;

    }
}
