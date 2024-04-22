package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.javaex.vo.PersonTestVo;

@Repository
public class PhonebookTestDao {
	
	@Autowired
	private SqlSession sqlSession;

	// 리스트 가져오기
	public List<PersonTestVo> phonebookSelectList() {
		System.out.println("PhonebookTestDao.phonebookSelectList()");

		List<PersonTestVo> personList = sqlSession.selectList("phonebook.selectList");

		System.out.println(personList);
		return personList;
	}
	

}
