package com.trello.api.services;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.filter.Filter;
import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import com.trello.api.ProjectConfig;
import org.aeonbits.owner.ConfigFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ApiService {

    ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

    protected RequestSpecification setUp() {

        return RestAssured
                .given().contentType(ContentType.JSON)
                .filters(getFilters());
    }

    private List<Filter> getFilters() {

        if ((config.logging())) {
            return Arrays.asList(new RequestLoggingFilter(), new ResponseLoggingFilter());
        }
        return Collections.emptyList();
    }
}