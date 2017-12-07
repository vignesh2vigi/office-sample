package com.kuwy.dao;

import java.util.List;

import com.kuwy.model.News;

public interface NewsDao {
	
	public News savenews(News news);
	public List<News>list();
 
	
}
