package com.trello.api.services;

import com.trello.api.assertions.AssertableResponse;
import com.trello.api.payloads.CardPayload;
import com.trello.api.payloads.ListPayload;
import com.trello.api.responses.ListResponse;

public class CardApiService extends ApiService {

    public AssertableResponse createCard(CardPayload card, ListPayload list, String cardName) {

        ListApiService listApiService = new ListApiService();
        ListResponse response = listApiService.createList(list).asPojo(ListResponse.class);

        return new AssertableResponse(setUp().given()
                .body(card).post(config.createCardEndpoint() + cardName + "&idList=" + response.getId()));
    }
}