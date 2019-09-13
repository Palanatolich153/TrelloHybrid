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
public class CardsPayload {

    @Builder.Default
    @JsonProperty("openPerList")
    private OpenPerListPayload openPerList;

    @Builder.Default
    @JsonProperty("totalPerList")
    private TotalPerListPayload totalPerList;
}
