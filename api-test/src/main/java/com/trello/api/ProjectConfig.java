package com.trello.api;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:config.properties"})
public interface ProjectConfig extends Config {

    String baseUrl();
    String token();
    String key();
    String idBoard();
    String createListEndpoint();
    String createCardEndpoint();
    String archiveListsEndpoint();

    boolean logging();
    boolean closed();
}