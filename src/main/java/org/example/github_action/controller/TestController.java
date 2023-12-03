package org.example.github_action.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * lijiang
 *
 * @date 2023/12/2
 * @project_name Github_Action
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String test(){
        return "github action";
    }
}
