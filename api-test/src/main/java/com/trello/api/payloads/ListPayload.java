package com.trello.api.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@ToString
@Accessors(chain = true)
public class ListPayload {

    @JsonProperty("id")
    @Builder.Default
    public String id;

    @JsonProperty("name")
    @Builder.Default
    public String name;

    @JsonProperty("closed")
    @Builder.Default
    public boolean closed;

    @JsonProperty("idBoard")
    @Builder.Default
    public String idBoard;

    @JsonProperty("pos")
    @Builder.Default
    public Double pos;

    @JsonProperty("limits")
    @Builder.Default
    public LimitsPayload limits;
}