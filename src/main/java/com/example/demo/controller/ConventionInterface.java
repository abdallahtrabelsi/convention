package com.example.demo.controller;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Convention;

public interface ConventionInterface extends CrudRepository<Convention, Long> {

}
