package io.karl.godoy.learning.development.sandbox.users.restapi.entity;

import java.util.Objects;

public class SandboxUserCreationResponse {

    private String responseCode;
    private String responseBody;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SandboxUserCreationResponse that = (SandboxUserCreationResponse) o;
        return Objects.equals(responseCode, that.responseCode) &&
                Objects.equals(responseBody, that.responseBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseCode, responseBody);
    }
}
