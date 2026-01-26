package com.sirdarey.behavioral.chain_of_responsibility;

abstract class _1_SupportHandler {

    protected _1_SupportHandler nextHandler;

    public void setNext(_1_SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String level) {
        if (canHandle(level)) {
            logHandling();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            System.out.println("Request cannot be handled.");
        }
    }

    protected abstract boolean canHandle(String level);

    protected abstract void logHandling();
}