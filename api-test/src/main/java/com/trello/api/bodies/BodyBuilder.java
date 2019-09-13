package com.trello.api.bodies;

import com.trello.api.ProjectConfig;
import com.trello.api.payloads.CardPayload;
import com.trello.api.payloads.ListPayload;
import org.aeonbits.owner.ConfigFactory;

public class BodyBuilder {

    ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

    public ListPayload createList(String listName) {

        ListPayload list = ListPayload.builder()
                .name(listName)
                .idBoard(config.idBoard())
                .closed(config.closed())
                .build();

        return list;
    }

    public CardPayload createCard() {

        CardPayload card = CardPayload.builder()
                .key(config.key())
                .token(config.token())
                .build();

        return card;
    }
}