package com.example.springmediatorexample.request;

import com.example.springmediatorexample.mediator.Request;

public class DisplayConsoleMessageRequest implements Request<Void> {
    private final String message;

    public DisplayConsoleMessageRequest(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
