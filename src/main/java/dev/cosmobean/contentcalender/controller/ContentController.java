package dev.cosmobean.contentcalender.controller;

import dev.cosmobean.contentcalender.model.Content;
import dev.cosmobean.contentcalender.model.Status;
import dev.cosmobean.contentcalender.model.Type;
import dev.cosmobean.contentcalender.repository.ContentCollectionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/content")
public class ContentController {

    private final ContentCollectionRepository repository;
    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    //make a request and fina all the pieces of content on the system
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }


}
