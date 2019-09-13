package com.trello.api.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Builder
@Accessors(fluent = true)
public class LimitsPayload {

    @Builder.Default
    @JsonProperty("cards")
    private CardsPayload cards;
}