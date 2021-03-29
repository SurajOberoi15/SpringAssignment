package com.knoldus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class ControllerShowTime {

    @RequestMapping("/status")
    public String showTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String formatDateTime = now.format(formatter);

        return "Running: " + formatDateTime;
    }
}
