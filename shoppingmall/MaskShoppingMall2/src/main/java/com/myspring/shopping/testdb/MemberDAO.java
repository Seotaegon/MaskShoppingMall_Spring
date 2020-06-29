package com.myspring.shopping.testdb;

import com.myspring.shopping.domain.memberVO;

public interface MemberDAO {
	
	public void signup(memberVO vo) throws Exception;
}
