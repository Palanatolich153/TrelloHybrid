package com.trello.api.core;

import com.jayway.restassured.RestAssured;
import com.trello.api.ProjectConfig;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

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

//        Services services = new Services();
//
//        //Archive all opened lists after test suite finished
//        services.archiveLists();
    }
}
