package com.trello.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trello.api.payloads.CardsPayload;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Limits{

	@JsonProperty("cards")
	private CardsPayload cards;

	public void setCards(CardsPayload cards){
		this.cards = cards;
	}

	public CardsPayload getCards(){
		return cards;
	}

	@Override
 	public String toString(){
		return 
			"Limits{" + 
			"cards = '" + cards + '\'' + 
			"}";
		}
}