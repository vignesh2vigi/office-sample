package com.kuwy.service;

import java.util.List;

import com.kuwy.dao.StoryDao;
import com.kuwy.dao.StoryDaoImpl;
import com.kuwy.model.Story;

public class StoryServiceImpl implements StoryService {

	@Override
	public Story save(Story story) {
		// TODO Auto-generated method stub
      StoryDao storyDao = new StoryDaoImpl();
		Story story1= storyDao.save(story);
		return story1;
	}

	@Override
	public List<Story> list() {
		// TODO Auto-generated method stub
		StoryDao storyDao=new StoryDaoImpl();
		   List<Story> list=storyDao.list();
	      return list;
	}

	@Override
	public Story delete(int storyid) {
		// TODO Auto-generated method stub
		StoryDao storyDao=new StoryDaoImpl();
		Story story=storyDao.delete(storyid);
		return story;
	}
	@Override
	public Story update(Story story) {
		// TODO Auto-generated method stub
		StoryDao storyDao= new StoryDaoImpl();
		Story user2=storyDao.update(story);
		return user2;
	}

}
