package io.springboot.githubtestproject.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    /** 안녕안녕 */
    public void gom(){
        System.out.println("gomgom");
    }

    public void punch(){
        System.out.println("punch");
    }

}
