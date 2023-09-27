package com.example.camping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //restcontroller는 @Conponent를 포함하는데 스프링빈에 이 클래스를 포함하게 하는 역할을 한다. restful(restxcontroller를 이용해서 구현한 웹)웹서버를 위한 클래스임을 알려준다.
public class HelloController {

    @GetMapping("") // 매핑은 보안의 역할도 한다. 사이트의 온전한 주소 대신 ""안의 주소를 사용하여 주소도 간결해지고 보안도 챙긴다. ""를 입력하면 보이는건 ""안의 글이지만 원래의 주소로 가게된다.
    public String hello(){
        return "Welcome";
    }
}