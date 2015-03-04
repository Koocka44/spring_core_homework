package com.epam.training.springcore.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epam.training.springcore.service.RpgService;

@Configuration
public class SpringConfigurationService {

	@Bean
	public RpgService rpgService(){
		return new RpgService();
	}
}
