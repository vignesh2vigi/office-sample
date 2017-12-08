package com.kuwy.service;

import java.util.List;

import com.kuwy.model.News;

public interface NewsService {

	public News savenews(News news);
	public List<News>list();
	public News delete(int newsid);
}
