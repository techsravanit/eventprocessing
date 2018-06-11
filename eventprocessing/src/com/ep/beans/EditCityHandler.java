package com.ep.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EditCityHandler implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;

	public void updateCity(int cityId, String cityName){
		//update the cities table based on the cityId.
		
		ReloadCacheEvent event=new ReloadCacheEvent(this, "cities");
		publisher.publishEvent(event);
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}

}
