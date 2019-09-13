package com.trello.api.responses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Generated;

@Getter
@Setter
@Generated("com.robohorse.robopojogenerator")
public class CardResponse{

	@JsonProperty("descData")
	private DescData descData;

	@JsonProperty("attachments")
	private List<Object> attachments;

	@JsonProperty("idLabels")
	private List<Object> idLabels;

	@JsonProperty("shortUrl")
	private String shortUrl;

	@JsonProperty("dueComplete")
	private boolean dueComplete;

	@JsonProperty("dateLastActivity")
	private String dateLastActivity;

	@JsonProperty("idList")
	private String idList;

	@JsonProperty("idMembersVoted")
	private List<Object> idMembersVoted;

	@JsonProperty("shortLink")
	private String shortLink;

	@JsonProperty("cover")
	private Cover cover;

	@JsonProperty("dueReminder")
	private Object dueReminder;

	@JsonProperty("subscribed")
	private boolean subscribed;

	@JsonProperty("pos")
	private int pos;

	@JsonProperty("idChecklists")
	private List<Object> idChecklists;

	@JsonProperty("stickers")
	private List<Object> stickers;

	@JsonProperty("id")
	private String id;

	@JsonProperty("email")
	private Object email;

	@JsonProperty("limits")
	private Limits limits;

	@JsonProperty("idBoard")
	private String idBoard;

	@JsonProperty("checkItemStates")
	private List<Object> checkItemStates;

	@JsonProperty("url")
	private String url;

	@JsonProperty("labels")
	private List<Object> labels;

	@JsonProperty("badges")
	private Badges badges;

	@JsonProperty("idMembers")
	private List<Object> idMembers;

	@JsonProperty("idShort")
	private int idShort;

	@JsonProperty("due")
	private Object due;

	@JsonProperty("idAttachmentCover")
	private Object idAttachmentCover;

	@JsonProperty("name")
	private String name;

	@JsonProperty("closed")
	private boolean closed;

	@JsonProperty("manualCoverAttachment")
	private boolean manualCoverAttachment;

	@JsonProperty("desc")
	private String desc;

	@Override
 	public String toString(){
		return 
			"CardResponse{" + 
			"descData = '" + descData + '\'' + 
			",attachments = '" + attachments + '\'' + 
			",idLabels = '" + idLabels + '\'' + 
			",shortUrl = '" + shortUrl + '\'' + 
			",dueComplete = '" + dueComplete + '\'' + 
			",dateLastActivity = '" + dateLastActivity + '\'' + 
			",idList = '" + idList + '\'' + 
			",idMembersVoted = '" + idMembersVoted + '\'' + 
			",shortLink = '" + shortLink + '\'' + 
			",cover = '" + cover + '\'' + 
			",dueReminder = '" + dueReminder + '\'' + 
			",subscribed = '" + subscribed + '\'' + 
			",pos = '" + pos + '\'' + 
			",idChecklists = '" + idChecklists + '\'' + 
			",stickers = '" + stickers + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",limits = '" + limits + '\'' + 
			",idBoard = '" + idBoard + '\'' + 
			",checkItemStates = '" + checkItemStates + '\'' + 
			",url = '" + url + '\'' + 
			",labels = '" + labels + '\'' + 
			",badges = '" + badges + '\'' + 
			",idMembers = '" + idMembers + '\'' + 
			",idShort = '" + idShort + '\'' + 
			",due = '" + due + '\'' + 
			",idAttachmentCover = '" + idAttachmentCover + '\'' + 
			",name = '" + name + '\'' + 
			",closed = '" + closed + '\'' + 
			",manualCoverAttachment = '" + manualCoverAttachment + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}