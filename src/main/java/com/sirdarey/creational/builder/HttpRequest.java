package com.sirdarey.creational.builder;


import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    // Immutable fields
    private final String method;
    private final String url;
    private final String body;
    private final Map<String, String> headers;

    // Private constructor: only the Builder can call this
    private HttpRequest(Builder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.body = builder.body;
        this.headers = builder.headers;
    }


    // Static Builder Class
    public static class Builder {

        // Required parameters
        private final String method;
        private final String url;

        // Optional parameters - initialized to defaults
        private String body = "";
        private final Map<String, String> headers = new HashMap<>();

        public Builder(String method, String url) {
            this.method = method;
            this.url = url;
        }

        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this; // Return self for chaining
        }

        public Builder body(String body) {
            this.body = body;
            return this; // Return self for chaining
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }

    @Override
    public String toString() {
        return "Request{method='" + method + "', url='" + url + "', body='" + body + "', headers=" + headers + "}";
    }
}