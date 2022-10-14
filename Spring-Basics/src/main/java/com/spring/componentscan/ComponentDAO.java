package com.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.springin5steps.scope.JdbcConnection;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {

	@Autowired
	ComponentJdbcConnection componentjdbcconnection;

	public ComponentJdbcConnection getJdbcconnection() {
		return componentjdbcconnection;
	}

	public void setJdbcconnection(ComponentJdbcConnection jdbcconnection) {
		this.componentjdbcconnection = jdbcconnection;
	}
		
}
