package dev.cosmobean.contentcalender.model;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime timeCreated,
        LocalDateTime timeUpdated,
        String url
) {

};
