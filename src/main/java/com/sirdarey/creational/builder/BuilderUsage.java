package com.sirdarey.creational.builder;


class BuilderUsage {

    /**
     * The Builder Pattern separates the construction of a complex object from its representation,
     * allowing the same construction process to create different representations.
     * This is particularly useful for creating objects with many optional parameters or configurations,
     * such as HTTP requests, complex UI components, or configuration objects.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Builder Pattern Demo -----\n");

        HttpRequest request = new HttpRequest.Builder("POST", "https://api.example.com/users")
                .addHeader("Authorization", "Bearer token123")
                .body("{ \"name\": \"Alice\" }")
                .build();

        System.out.println(request);

        System.out.println("\n----- Ending Builder Pattern Demo -----\n");
    }
}