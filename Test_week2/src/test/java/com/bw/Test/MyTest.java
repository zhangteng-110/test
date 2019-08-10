package com.bw.Test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.bean.NewsLink;
import com.bw.mapper.MyMapper;
import com.bw.utils.CommonUtil;
import com.bw.utils.DateUtil;

public class MyTest {
	@Test
	public void test(){
		String url = "http://news.cnstock.com/news,yw-2019/08/10-4413224.htm";
		String[] split = url.split("-");
		String time = split[1];
		int weight = CommonUtil.getPlaceHolder(split[2],"[^0-9]");
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyMapper mapper = classPathXmlApplicationContext.getBean(MyMapper.class);
		NewsLink link = new NewsLink();
		link.setWeight(weight);
		link.setCreated(DateUtil.stringToDate(time,"yyyy/MM/dd"));
		mapper.add(link);
	}
}
