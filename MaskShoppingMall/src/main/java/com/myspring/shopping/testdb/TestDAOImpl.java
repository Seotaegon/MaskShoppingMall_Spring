package com.myspring.shopping.testdb;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO{
	private static final String namespace="com.myspring.shopping.testMapper";
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<TestVO> test() throws Exception{
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".SelectTest");
	}
}
