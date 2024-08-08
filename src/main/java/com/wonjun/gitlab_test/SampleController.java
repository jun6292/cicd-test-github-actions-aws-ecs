package com.wonjun.gitlab_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/sample")
    public String sample() {
        return "hello world > 수정 후 커밋해 보겠음!!";
    }
}
