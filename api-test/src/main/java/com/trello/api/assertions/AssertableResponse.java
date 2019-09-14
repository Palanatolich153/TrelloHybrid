package com.trello.api.assertions;

import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;
import com.trello.api.conditions.Condition;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class AssertableResponse {

    private final Response response;

    @Step("api response should have {condition}")
    public AssertableResponse shouldHave(Condition condition) {

        log.info("About to check condition {}", condition);

        condition.check(response);
        return this;
    }

    public <T> T asPojo(Class<T> tClass) {
        return response.as(tClass);
    }

    public Headers headers() {
        return response.getHeaders();
    }

    public Response getResponse() {
        return response;
    }
}