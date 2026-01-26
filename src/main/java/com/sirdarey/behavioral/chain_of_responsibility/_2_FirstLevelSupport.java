package com.sirdarey.behavioral.chain_of_responsibility;

class _2_FirstLevelSupport extends _1_SupportHandler {

    @Override
    protected boolean canHandle(String level) {
        return level.equals("BASIC");
    }

    @Override
    protected void logHandling() {
        System.out.println("Level 1 handled ticket.");
    }
}