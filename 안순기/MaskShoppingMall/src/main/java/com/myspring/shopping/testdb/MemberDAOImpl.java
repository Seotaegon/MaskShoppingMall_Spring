package com.myspring.shopping.testdb;



import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
	private static final String namespace="com.myspring.shopping.testMapper";
	
	@Inject
	private SqlSession sqlSession;
	
	
	
	//회원 가입
	@Override
		public void signup(MemberVO vo) throws Exception{
		sqlSession.insert(namespace + ".signup", vo);
	}
	
	//로그인
		@Override
		public MemberVO signin(MemberVO vo) throws Exception{
			return sqlSession.selectOne(namespace + ".signin", vo);
		}
}
