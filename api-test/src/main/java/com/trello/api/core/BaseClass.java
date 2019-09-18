package com.trello.api.core;

import com.google.gson.JsonArray;
import com.jayway.restassured.RestAssured;
import com.trello.api.ProjectConfig;
import com.trello.api.bodies.BodyBuilder;
import com.trello.api.helpers.Helper;
import com.trello.api.payloads.ArchiveListPayload;
import com.trello.api.services.ListApiService;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.List;

public class BaseClass {

    protected String key;
    protected String token;
    protected String idBoard;
    protected boolean isListClosed;

    @BeforeSuite
    public void beforeSuiteAction() {

        ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

        RestAssured.baseURI = config.baseUrl();

        key = config.key();
        token = config.token();
        idBoard = config.idBoard();
        isListClosed = config.closed();
    }

    @AfterSuite
    public void afterSuiteActions() {

        Helper helper = new Helper();
        ListApiService listApi = new ListApiService();
        BodyBuilder bodyBuilder = new BodyBuilder();

        ArchiveListPayload list = bodyBuilder.archiveList();

        JsonArray responseBody = helper.executeGetRequestAndReturnRequestBodyAsJsonArray();

        List<String> values = helper.getSameValuesFromJson(responseBody, "id");

        values.parallelStream().forEach(value -> listApi.archiveLists(list, value));
    }
}
