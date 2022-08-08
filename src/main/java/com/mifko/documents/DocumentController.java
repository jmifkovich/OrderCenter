package com.mifko.documents;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentController
{
    private final DocumentRepository repository;

    DocumentController(DocumentRepository repo)
    {
        this.repository=repo;
    }

    @GetMapping("/documents")
    List<Document> all(){
        return repository.findAll();
    }

    @PostMapping("/documents")
    Document newDocument(@RequestBody Document newDocument){
        return repository.save(newDocument);
    }


}
