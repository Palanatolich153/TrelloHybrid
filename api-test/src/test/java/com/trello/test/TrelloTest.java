package com.trello.test;

import com.github.javafaker.Faker;
import com.trello.api.bodies.BodyBuilder;
import com.trello.api.conditions.Conditions;
import com.trello.api.core.BaseClass;
import com.trello.api.payloads.CardPayload;
import com.trello.api.payloads.ListPayload;
import com.trello.api.responses.CardResponse;
import com.trello.api.responses.ListResponse;
import com.trello.api.services.CardApiService;
import com.trello.api.services.ListApiService;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;

public class TrelloTest extends BaseClass {

    @Test
    @Step
    public void createListSimpleApproach() {
        // given
        Faker faker = new Faker();
        SoftAssert assertion = new SoftAssert();
        BodyBuilder bodyBuilder = new BodyBuilder();
        ListApiService listApiService = new ListApiService();

        String listName = faker.name().username();

        ListPayload list = bodyBuilder.createList(listName);

        // expect
        ListResponse response = listApiService
                .createList(list)
                .shouldHave(Conditions.statusCode(200))
                .shouldHave(Conditions.bodyField("name", not(isEmptyOrNullString())))
                .asPojo(ListResponse.class);

        assertion.assertEquals(response.getName(), listName, "Created list name");
        assertion.assertAll();
    }

    @Test
    public void createCardSimpleApproach() {
        // given
        Faker faker = new Faker();
        SoftAssert assertion = new SoftAssert();
        BodyBuilder bodyBuilder = new BodyBuilder();

        String listName = faker.name().username();
        String cardName = faker.name().username();

        ListPayload list = bodyBuilder.createList(listName);
        CardApiService cardApiService = new CardApiService();

        CardPayload card = bodyBuilder.createCard();
        // expect
        CardResponse response = cardApiService
                .createCard(card, list, cardName)
                .shouldHave(Conditions.statusCode(200))
                .shouldHave(Conditions.bodyField("id", not(isEmptyOrNullString())))
                .asPojo(CardResponse.class);

        assertion.assertEquals(response.getName(), cardName, "Created card name");
        assertion.assertAll();
    }
}