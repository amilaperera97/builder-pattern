package com.designpattern.builder;

import com.designpattern.builder.contact.Contact;
import com.designpattern.builder.contact.ContactBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {

		SpringApplication.run(BuilderApplication.class, args);

		Contact contact = new ContactBuilder().setAddress("")
				.buildContact();
	}

}
