package com.myspring.shopping.service;

import java.util.List;

import com.myspring.shopping.Bean.BoardBean;

public interface BoardService {
	public List<BoardBean> board() throws Exception;
	public List<BoardBean> list() throws Exception;
	public List<BoardBean> write() throws Exception;
}
