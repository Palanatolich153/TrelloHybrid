package com.trello.api.helpers;

import com.google.gson.*;
import com.jayway.restassured.response.Response;
import com.trello.api.services.CardApiService;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Helper {

    public JsonArray createResponseBodyJsonArray(Response response) {

        Gson gson = new GsonBuilder().create();

        JsonArray jsonArray = null;

        try {
            jsonArray = gson.fromJson(response.getBody().asString(), JsonArray.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            Assert.fail("JsonSyntaxException happened in " + new Object() {
            }.getClass().getEnclosingMethod().getName());
        }
        return jsonArray;
    }

    public JsonArray executeGetRequestAndReturnRequestBodyAsJsonArray() {

        Helper helper = new Helper();

        Response response = new CardApiService().getLists().getResponse();

        return helper.createResponseBodyJsonArray(response);
    }

    public String modifyString(JsonElement element) {

        String elementToString = element.toString();

        return elementToString.substring(1, elementToString.length() - 1);
    }

    public List<String> getSameValuesFromJson(JsonArray body, String key) {

        Gson gson = new Gson();

        return IntStream.range(0, body.size()).
                mapToObj(index -> (modifyString(gson.fromJson(body.get(index), JsonObject.class).get(key)))).collect(Collectors.toList());
    }
}
