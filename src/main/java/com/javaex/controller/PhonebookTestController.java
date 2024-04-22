package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookTestService;
import com.javaex.vo.PersonTestVo;



@RestController
public class PhonebookTestController {
	
	@Autowired
	private PhonebookTestService phonebookTestService;
	
	//리스트 불러오기
	@GetMapping(value = "api/persons")
	public List<PersonTestVo> list() {
		System.out.println("PhonebookTestController.list()");

		List<PersonTestVo> personList = phonebookTestService.exePhonebookList();

		System.out.println(personList);

		
		return personList;
	}
}
