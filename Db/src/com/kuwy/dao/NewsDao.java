package com.kuwy.dao;

import java.util.List;

import com.kuwy.model.News;

public interface NewsDao {
	
	void savenews(News news);
	List<News>getnews();
 
	
}
