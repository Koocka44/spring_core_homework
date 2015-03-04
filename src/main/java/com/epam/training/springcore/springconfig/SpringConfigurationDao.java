package com.epam.training.springcore.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epam.training.springcore.dao.CharacterAttributesDao;
import com.epam.training.springcore.dao.WeaponDao;

@Configuration
public class SpringConfigurationDao {

	@Bean
	public WeaponDao weaponDao(){
		return new WeaponDao();
	}
	
	@Bean
	public CharacterAttributesDao characterAttributeDao(){
		return new CharacterAttributesDao();
	}
}
