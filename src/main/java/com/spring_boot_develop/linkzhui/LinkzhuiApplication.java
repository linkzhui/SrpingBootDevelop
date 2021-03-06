package com.spring_boot_develop.linkzhui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LinkzhuiApplication {

	@Autowired
	private AuthorSettings authorSettings;

	@RequestMapping("/")
	String index(){
		return "book name is: "+authorSettings.getName()+" and book author is: "+authorSettings.getAge();
	}
	public static void main(String[] args)
	{
		SpringApplication.run(LinkzhuiApplication.class, args);
	}
}
