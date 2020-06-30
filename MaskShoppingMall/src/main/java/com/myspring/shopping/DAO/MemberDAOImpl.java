package com.myspring.shopping.DAO;



import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.myspring.shopping.VO.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	private static final String namespace="com.myspring.shopping.MemberMapper";
	
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
