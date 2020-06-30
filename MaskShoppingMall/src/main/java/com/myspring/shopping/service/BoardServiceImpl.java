package com.myspring.shopping.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.myspring.shopping.Bean.BoardBean;
import com.myspring.shopping.DAO.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO dao;

	@Override
	public List<BoardBean> board() throws Exception {
		// TODO Auto-generated method stub
		return dao.board();
	}
	public List<BoardBean> list() throws Exception {
		// TODO Auto-generated method stub
		return dao.list();
	}
	
	public List<BoardBean> write() throws Exception {
		// TODO Auto-generated method stub
		return dao.write();
	}
}
