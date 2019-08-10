package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.NewsLink;
import com.bw.mapper.MyMapper;

@Service
@Transactional
public class MyServiceImp implements MyService{
	@Autowired
	private MyMapper myMapper;
	@Override
	public List<NewsLink> list() {
		return myMapper.list();
	}

}
