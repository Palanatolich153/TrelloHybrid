package com.trello.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Badges{

	@JsonProperty("comments")
	private int comments;

	@JsonProperty("attachments")
	private int attachments;

	@JsonProperty("attachmentsByType")
	private AttachmentsByType attachmentsByType;

	@JsonProperty("dueComplete")
	private boolean dueComplete;

	@JsonProperty("description")
	private boolean description;

	@JsonProperty("subscribed")
	private boolean subscribed;

	@JsonProperty("due")
	private Object due;

	@JsonProperty("viewingMemberVoted")
	private boolean viewingMemberVoted;

	@JsonProperty("location")
	private boolean location;

	@JsonProperty("votes")
	private int votes;

	@JsonProperty("fogbugz")
	private String fogbugz;

	@JsonProperty("checkItems")
	private int checkItems;

	@JsonProperty("checkItemsChecked")
	private int checkItemsChecked;

	public void setComments(int comments){
		this.comments = comments;
	}

	public int getComments(){
		return comments;
	}

	public void setAttachments(int attachments){
		this.attachments = attachments;
	}

	public int getAttachments(){
		return attachments;
	}

	public void setAttachmentsByType(AttachmentsByType attachmentsByType){
		this.attachmentsByType = attachmentsByType;
	}

	public AttachmentsByType getAttachmentsByType(){
		return attachmentsByType;
	}

	public void setDueComplete(boolean dueComplete){
		this.dueComplete = dueComplete;
	}

	public boolean isDueComplete(){
		return dueComplete;
	}

	public void setDescription(boolean description){
		this.description = description;
	}

	public boolean isDescription(){
		return description;
	}

	public void setSubscribed(boolean subscribed){
		this.subscribed = subscribed;
	}

	public boolean isSubscribed(){
		return subscribed;
	}

	public void setDue(Object due){
		this.due = due;
	}

	public Object getDue(){
		return due;
	}

	public void setViewingMemberVoted(boolean viewingMemberVoted){
		this.viewingMemberVoted = viewingMemberVoted;
	}

	public boolean isViewingMemberVoted(){
		return viewingMemberVoted;
	}

	public void setLocation(boolean location){
		this.location = location;
	}

	public boolean isLocation(){
		return location;
	}

	public void setVotes(int votes){
		this.votes = votes;
	}

	public int getVotes(){
		return votes;
	}

	public void setFogbugz(String fogbugz){
		this.fogbugz = fogbugz;
	}

	public String getFogbugz(){
		return fogbugz;
	}

	public void setCheckItems(int checkItems){
		this.checkItems = checkItems;
	}

	public int getCheckItems(){
		return checkItems;
	}

	public void setCheckItemsChecked(int checkItemsChecked){
		this.checkItemsChecked = checkItemsChecked;
	}

	public int getCheckItemsChecked(){
		return checkItemsChecked;
	}

	@Override
 	public String toString(){
		return 
			"Badges{" + 
			"comments = '" + comments + '\'' + 
			",attachments = '" + attachments + '\'' + 
			",attachmentsByType = '" + attachmentsByType + '\'' + 
			",dueComplete = '" + dueComplete + '\'' + 
			",description = '" + description + '\'' + 
			",subscribed = '" + subscribed + '\'' + 
			",due = '" + due + '\'' + 
			",viewingMemberVoted = '" + viewingMemberVoted + '\'' + 
			",location = '" + location + '\'' + 
			",votes = '" + votes + '\'' + 
			",fogbugz = '" + fogbugz + '\'' + 
			",checkItems = '" + checkItems + '\'' + 
			",checkItemsChecked = '" + checkItemsChecked + '\'' + 
			"}";
		}
}