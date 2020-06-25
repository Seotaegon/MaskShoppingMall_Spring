package com.myspring.shopping.testdb;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;

	@Override
	public List<TestVO> test() throws Exception {
		// TODO Auto-generated method stub
		return dao.test();
	}
}
