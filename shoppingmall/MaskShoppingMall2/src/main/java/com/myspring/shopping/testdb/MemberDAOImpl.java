package com.myspring.shopping.testdb;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.myspring.shopping.domain.memberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.myspring.shopping.memberMapper";
	
	//회원가입
	@Override
	public void signup(memberVO vo) throws Exception{
		sql.insert(namespace+".signup", vo);
	}
}
