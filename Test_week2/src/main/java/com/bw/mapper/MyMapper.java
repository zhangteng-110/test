package com.bw.mapper;

import java.util.List;

import com.bw.bean.NewsLink;

public interface MyMapper {

	void add(NewsLink newsLink);
	
	List<NewsLink> list();

}
