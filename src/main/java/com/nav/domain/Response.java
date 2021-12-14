package com.nav.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Response {
    public String responseContent;

    public static Response DummyResponse() {
        Response response = new Response();
        response.responseContent = "hello-world /PUT success - JSON response";
        return response;
    }
}


