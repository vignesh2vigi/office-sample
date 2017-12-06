package com.kuwy.service;

import java.util.List;

import com.kuwy.dao.StoryDao;
import com.kuwy.dao.StoryDaoImpl;
import com.kuwy.model.Story;

public class StoryServiceImpl implements StoryService {

	@Override
	public void upload(Story story) {
		// TODO Auto-generated method stub
		StoryDao storyDao = new StoryDaoImpl();
		storyDao.upload(story);

	}

	@Override
	public List<Story> getstory() {
		// TODO Auto-generated method stub
		StoryDao storyDao = new StoryDaoImpl();
		// TODO Auto-generated method stub
		return storyDao.getstory();
				}

}
