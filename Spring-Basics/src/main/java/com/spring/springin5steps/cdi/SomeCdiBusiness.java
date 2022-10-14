package com.spring.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Named


public class SomeCdiBusiness {

	//@Autowired
	@Inject
	SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCDIDAO() {
		return someCdiDAO;
	}

	public void setSomeCDIDAO(SomeCdiDAO someCDIDAO) {
		this.someCdiDAO = someCDIDAO;
	}
	
	
}
