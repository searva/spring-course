package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

import spittr.Spittle;
import spittr.SpittleBeanFactory;

@Configuration
@ComponentScan(basePackages={"spittr"}, excludeFilters={@Filter(type=FilterType.ANNOTATION, value=Controller.class)})
@Import(SecurityConfig.class)
public class RootConfig {

	
	@Bean
	public Spittle createSpittle(){
		Spittle spittle;
		try {
			spittle = new SpittleBeanFactory().getObject();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return spittle;
	}
}
