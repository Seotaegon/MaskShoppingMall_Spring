package com.myspring.shopping.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.myspring.shopping.domain.memberVO;
import com.myspring.shopping.testdb.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	private MemberDAO dao;
	
	@Override
	public void signup(memberVO vo) throws Exception{
		dao.signup(vo);
	}
}
