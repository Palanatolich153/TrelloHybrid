package com.trello.api.services;

import com.trello.api.assertions.AssertableResponse;
import com.trello.api.payloads.ListPayload;

public class ListApiService extends ApiService {

    public AssertableResponse createList(ListPayload list) {

        return new AssertableResponse(setUp().given().pathParam("key", config.key()).pathParam("token", config.token())
                .body(list).post(config.createListEndpoint() + "{key}&token={token}"));
    }
}