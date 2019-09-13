package com.trello.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Cover{

	@JsonProperty("idUploadedBackground")
	private Object idUploadedBackground;

	@JsonProperty("brightness")
	private String brightness;

	@JsonProperty("color")
	private Object color;

	@JsonProperty("size")
	private String size;

	@JsonProperty("idAttachment")
	private Object idAttachment;

	public void setIdUploadedBackground(Object idUploadedBackground){
		this.idUploadedBackground = idUploadedBackground;
	}

	public Object getIdUploadedBackground(){
		return idUploadedBackground;
	}

	public void setBrightness(String brightness){
		this.brightness = brightness;
	}

	public String getBrightness(){
		return brightness;
	}

	public void setColor(Object color){
		this.color = color;
	}

	public Object getColor(){
		return color;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setIdAttachment(Object idAttachment){
		this.idAttachment = idAttachment;
	}

	public Object getIdAttachment(){
		return idAttachment;
	}

	@Override
 	public String toString(){
		return 
			"Cover{" + 
			"idUploadedBackground = '" + idUploadedBackground + '\'' + 
			",brightness = '" + brightness + '\'' + 
			",color = '" + color + '\'' + 
			",size = '" + size + '\'' + 
			",idAttachment = '" + idAttachment + '\'' + 
			"}";
		}
}