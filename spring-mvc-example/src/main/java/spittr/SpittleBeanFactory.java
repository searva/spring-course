package spittr;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class SpittleBeanFactory implements FactoryBean<Spittle> {

	@Override
	public Spittle getObject() throws Exception {
		Spittle spittle = new Spittle("spittle", new Date());
		
		return spittle;
	}

	@Override
	public Class<?> getObjectType() {
		return Spittle.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	

}
