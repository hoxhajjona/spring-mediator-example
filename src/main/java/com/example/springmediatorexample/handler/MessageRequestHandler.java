package com.example.springmediatorexample.handler;

import com.example.springmediatorexample.mediator.RequestHandler;
import com.example.springmediatorexample.request.MessageRequest;
import org.springframework.stereotype.Component;

@Component
public class MessageRequestHandler implements RequestHandler<MessageRequest, String> {
    @Override
    public String handle(MessageRequest request) {
        // Demos that we now have access and can use the request instance that matched with this handler.
        return request.getMessage();
    }
}
