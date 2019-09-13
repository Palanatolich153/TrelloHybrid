package com.trello.api.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class CardPayload {

    @Builder.Default
    @JsonProperty("key")
    private String key;

    @Builder.Default
    @JsonProperty("token")
    private String token;
}