package com.trello.api.services;

import com.trello.api.assertions.AssertableResponse;
import com.trello.api.payloads.ArchiveListPayload;
import com.trello.api.payloads.ListPayload;

public class ListApiService extends ApiService {

    public AssertableResponse createList(ListPayload list) {

        return new AssertableResponse(setUp().given().pathParam("key", config.key()).pathParam("token", config.token())
                .body(list).post(config.createListEndpoint() + "{key}&token={token}"));
    }

    public AssertableResponse archiveLists(ArchiveListPayload list, String value){

        return new AssertableResponse(setUp()
                .body(list).put("1/lists/" + value));
    }
}