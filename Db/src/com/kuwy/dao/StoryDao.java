package com.kuwy.dao;

import java.util.List;

import com.kuwy.model.Story;

public interface StoryDao {

	public Story save(Story story);
	public List<Story>list();
	public Story delete(int storyid);
}
