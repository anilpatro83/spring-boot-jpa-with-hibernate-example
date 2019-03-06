package com.example.springjpa.springbootjpawithhibernateexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpa.springbootjpawithhibernateexample.dto.Person;
import com.example.springjpa.springbootjpawithhibernateexample.dto.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Person> findAll(){
		return personRepository.findAll();
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<Person> findByAge(@RequestParam("age") Integer age){
		return personRepository.findByAge(age);
	}

	@RequestMapping(value="/", method=RequestMethod.POST)
	public Person create(@RequestBody Person person){
		return personRepository.save(person);
	}

}
