package com.nikonov.telegram.bot.reminder.resource;

import com.nikonov.telegram.bot.reminder.dto.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class Resource {

    @GetMapping
    public Response getName() {
        return new Response("Olga");
    }
}
