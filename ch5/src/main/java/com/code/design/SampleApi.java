package com.code.design;

import com.code.design.exception.EntityNotFoundException;
import com.code.design.member.Member;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/sample")
public class SampleApi {

    @GetMapping
    public Member test(
            @RequestParam String value
    ) {
        if (value.equals("value")) {
//            throw new IllegalArgumentException("System Error Java 8 version ...");
            throw new EntityNotFoundException(ErrorCode.INVALID_INPUT_VALUE.getCode());
        } else if (value.equals("none")) {
            throw new IllegalStateException("System Error Java 8 version ...");
        } else {
            return new Member("test@test.com");
        }
    }

    @PostMapping
    public void test2(
            @RequestBody @Valid Member member
    ) {

    }
}
