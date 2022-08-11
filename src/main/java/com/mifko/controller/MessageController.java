package com.mifko.controller;

import com.mifko.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController
{
    private final MessageRepository repository;

    MessageController(MessageRepository repo)
    {
        this.repository=repo;
    }

    @GetMapping("/messages")
    List<Message> all(){
        return repository.findAll();
    }

    @PostMapping("/messages")
    Message newDocument(@RequestBody Message newDocument){
        return repository.save(newDocument);
    }


}
