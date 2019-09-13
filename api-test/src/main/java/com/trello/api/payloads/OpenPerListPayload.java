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
public class OpenPerListPayload {

    @JsonProperty("status")
    @Builder.Default
    private String status;

    @JsonProperty("disableAt")
    @Builder.Default
    private long disableAt;

    @JsonProperty("warnAt")
    @Builder.Default
    private long warnAt;
}
