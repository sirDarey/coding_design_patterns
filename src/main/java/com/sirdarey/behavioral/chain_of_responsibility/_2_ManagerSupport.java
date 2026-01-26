package com.sirdarey.behavioral.chain_of_responsibility;

class _2_ManagerSupport extends _1_SupportHandler {

    protected boolean canHandle(String level) {
        return level.equals("CRITICAL");
    }

    protected void logHandling() {
        System.out.println("Manager handled ticket.");
    }
}