package com.kuwy.service;

import java.util.List;

import com.kuwy.dao.NewsDao;
import com.kuwy.dao.NewsDaoImpl;
import com.kuwy.model.News;

public class NewsServiceImpl implements NewsService {

	@Override
	public void savenews(News news) {
		// TODO Auto-generated method stub
		NewsDao newsDao = new NewsDaoImpl();
		newsDao.savenews(news);
	}

	@Override
	public List<News> getnews() {
		// TODO Auto-generated method stub
		NewsDao newsDao = new NewsDaoImpl();
			// TODO Auto-generated method stub
			return newsDao.getnews();
		
	}

}
