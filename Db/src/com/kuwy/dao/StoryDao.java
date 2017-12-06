package com.kuwy.dao;

import java.util.List;

import com.kuwy.model.Story;

public interface StoryDao {

	void upload(Story story);
	List<Story>getstory();
	
}
