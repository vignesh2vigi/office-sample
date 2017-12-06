package com.kuwy.service;

import java.util.List;

import com.kuwy.model.News;

public interface NewsService {

	void savenews(News news);
	List<News>getnews();
}
