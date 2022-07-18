package com.example.springmediatorexample.handler;

import com.example.springmediatorexample.mediator.RequestHandler;
import com.example.springmediatorexample.request.TestRequest;

public class TestRequestHandler implements RequestHandler<TestRequest, String> {
    @Override
    public String handle(TestRequest request) {
        // Just returns a hard coded value.
        return "Test Request";
    }
}
