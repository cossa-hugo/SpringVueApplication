package com.okta.springbootvue.SpringVueApplication.repository;

import com.okta.springbootvue.SpringVueApplication.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
