package com.trello.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AttachmentsByType{

	@JsonProperty("trello")
	private Trello trello;

	public void setTrello(Trello trello){
		this.trello = trello;
	}

	public Trello getTrello(){
		return trello;
	}

	@Override
 	public String toString(){
		return 
			"AttachmentsByType{" + 
			"trello = '" + trello + '\'' + 
			"}";
		}
}