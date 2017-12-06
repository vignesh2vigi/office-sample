package com.kuwy.service;

import java.util.List;

import com.kuwy.model.Story;

public interface StoryService {

	void upload(Story story);
	List<Story>getstory();
}
