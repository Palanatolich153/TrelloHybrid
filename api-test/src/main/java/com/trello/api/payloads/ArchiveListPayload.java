package com.trello.api.payloads;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class ArchiveListPayload {

    @SerializedName("closed")
    @Expose
    @Builder.Default
    private Boolean closed;
    @SerializedName("idBoard")
    @Expose
    @Builder.Default
    private String idBoard;
    @SerializedName("pos")
    @Expose
    @Builder.Default
    private Double pos;
    @SerializedName("key")
    @Expose
    @Builder.Default
    private String key;
    @SerializedName("token")
    @Expose
    @Builder.Default
    private String token;
}