package com.kuwy.model;


public class News {

	private  int newsid;
	private String headnews;
	private String content;
	private boolean status;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getHeadnews() {
		return headnews;
	}
	public void setHeadnews(String headnews) {
		this.headnews = headnews;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
