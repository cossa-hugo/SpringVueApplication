package com.okta.springbootvue.SpringVueApplication.repository;

import com.okta.springbootvue.SpringVueApplication.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class RestRepositoryConfigurator implements RepositoryRestConfigurer {
}
