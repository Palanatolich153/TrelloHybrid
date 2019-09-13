package com.trello.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Generated;

@Getter
@Setter
@Generated("com.robohorse.robopojogenerator")
public class ListResponse {

    @JsonProperty("idBoard")
    private String idBoard;

    @JsonProperty("pos")
    private String pos;

    @JsonProperty("name")
    private String name;

    @JsonProperty("closed")
    private boolean closed;

    @JsonProperty("id")
    private String id;

    @JsonProperty("limits")
    private Limits limits;

    @Override
    public String toString() {
        return
                "ListResponse{" +
                        "idBoard = '" + idBoard + '\'' +
                        ",pos = '" + pos + '\'' +
                        ",name = '" + name + '\'' +
                        ",closed = '" + closed + '\'' +
                        ",id = '" + id + '\'' +
                        ",limits = '" + limits + '\'' +
                        "}";
    }
}