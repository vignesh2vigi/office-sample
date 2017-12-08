package com.kuwy.service;

import java.util.List;

import com.kuwy.dao.NewsDao;
import com.kuwy.dao.NewsDaoImpl;
import com.kuwy.model.News;

public class NewsServiceImpl implements NewsService {

	@Override
	public News savenews(News news) {
		// TODO Auto-generated method stub
		NewsDao newsDao = new NewsDaoImpl();
		News news1= newsDao.savenews(news);
		
		return news1;
	}

	@Override
	public List<News> list() {
		// TODO Auto-generated method stub
		   NewsDao newsDao=new NewsDaoImpl();
		   
		      List<News> list=newsDao.list();
		      return list;
		}

	@Override
	public News delete(int newsid) {
		// TODO Auto-generated method stub
		NewsDao newsDao=new NewsDaoImpl();
		News news=newsDao.delete(newsid);
		return news;
	}

}
