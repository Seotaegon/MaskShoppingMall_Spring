package com.myspring.shopping.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.myspring.shopping.Bean.BoardBean;

@Repository
public class BoardDAOImpl implements BoardDAO {
private static final String namespace="com.myspring.shopping.BoardMapper";
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BoardBean> board() throws Exception{
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".Select");
	}
	
	@Override
	public List<BoardBean> list() throws Exception{
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".List");
	}
	
	@Override
	public List<BoardBean> write() throws Exception{
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".Write");
	}
}
