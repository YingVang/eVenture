package com.example.eventure;

public class Story {
	private StoryInfo info; 
	private StoryTree tree;
	
	public Story(StoryInfo i){
		info=i;
	}
	
	public StoryInfo getStoryInfo(){return info;}
	
	public StoryTree getStoryTree(){return tree;}
	
	
	//public void playStory(){	}
	
}
