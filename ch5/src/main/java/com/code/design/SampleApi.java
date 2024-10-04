package com.code.design;

import com.code.design.member.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleApi {

    @GetMapping
    public Member test(
            @RequestParam String value
    ) {
        if (value.equals("value")) {
            throw new IllegalArgumentException("System Error Java 8 version ...");
        } else if (value.equals("none")) {
            throw new IllegalStateException("System Error Java 8 version ...");
        } else {
            return new Member("test@test.com");
        }
    }
}
