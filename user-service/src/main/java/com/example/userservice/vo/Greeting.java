package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@AllArgsConstructor
@Data
@Component
public class Greeting {
    @Value("${greeting.message}")
    private String message;

}
