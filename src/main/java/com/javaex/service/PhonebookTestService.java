package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookTestDao;
import com.javaex.vo.PersonTestVo;



@Service
public class PhonebookTestService {
	
	@Autowired
	private PhonebookTestDao phonebookTestDao;
	
	// 리스트 가져오기
		public List<PersonTestVo> exePhonebookList() {
			System.out.println("PhonebookTestService.exePhonebookList()");

			List<PersonTestVo> personList = phonebookTestDao.phonebookSelectList();
			return personList;
		}
	

}
