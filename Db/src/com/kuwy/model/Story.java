package com.kuwy.model;



public class Story {

	private int storyid;
	private String storyhead;
	private String story;
	private boolean status;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getStoryid() {
		return storyid;
	}
	public void setStoryid(int storyid) {
		this.storyid = storyid;
	}
	public String getStoryhead() {
		return storyhead;
	}
	public void setStoryhead(String storyhead) {
		this.storyhead = storyhead;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
}
