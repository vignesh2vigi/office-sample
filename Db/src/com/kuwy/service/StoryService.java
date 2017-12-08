package com.kuwy.service;

import java.util.List;

import com.kuwy.model.Story;

public interface StoryService {

	public Story save(Story story);
	public List<Story>list();
	public Story delete(int storyid);
	public Story update(Story story);
}
