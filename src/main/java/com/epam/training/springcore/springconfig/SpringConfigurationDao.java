package com.epam.training.springcore.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epam.training.springcore.dao.CharacterAttributeDao;
import com.epam.training.springcore.dao.WeaponDao;

@Configuration
public class SpringConfigurationDao {

	@Bean
	public WeaponDao weaponDao(){
		return new WeaponDao();
	}
	
	@Bean
	public CharacterAttributeDao characterAttributeDao(){
		return new CharacterAttributeDao();
	}
}
