package com.trello.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Trello{

	@JsonProperty("board")
	private int board;

	@JsonProperty("card")
	private int card;

	public void setBoard(int board){
		this.board = board;
	}

	public int getBoard(){
		return board;
	}

	public void setCard(int card){
		this.card = card;
	}

	public int getCard(){
		return card;
	}

	@Override
 	public String toString(){
		return 
			"Trello{" + 
			"board = '" + board + '\'' + 
			",card = '" + card + '\'' + 
			"}";
		}
}