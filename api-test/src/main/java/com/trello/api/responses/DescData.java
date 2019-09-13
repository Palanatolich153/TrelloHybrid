package com.trello.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DescData{

	@JsonProperty("emoji")
	private Emoji emoji;

	public void setEmoji(Emoji emoji){
		this.emoji = emoji;
	}

	public Emoji getEmoji(){
		return emoji;
	}

	@Override
 	public String toString(){
		return 
			"DescData{" + 
			"emoji = '" + emoji + '\'' + 
			"}";
		}
}