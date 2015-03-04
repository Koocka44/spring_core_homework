package com.epam.training.springcore;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.springcore.model.Character;
import com.epam.training.springcore.service.RpgService;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		// AbstractApplicationContext context = new
		// AnnotationConfigApplicationContext(
		// SpringConfigurationDao.class,
		// SpringConfigurationDatabaseConnection.class,
		// SpringConfigurationService.class);

		RpgService rpgService = context.getBean("rpgService", RpgService.class);
		List<Character> characters = rpgService.buildCharacters();
		for (Character c : characters) {
			System.out.println(c);
		}
	}
}
