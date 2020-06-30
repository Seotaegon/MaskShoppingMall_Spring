package com.myspring.shopping.DAO;

import java.util.List;

import com.myspring.shopping.Bean.BoardBean;

public interface BoardDAO {
	public List<BoardBean> board() throws Exception;
	public List<BoardBean> list() throws Exception;
	public List<BoardBean> write() throws Exception;
}
