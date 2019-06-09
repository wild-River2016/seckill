package com.lsh.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.lsh.redis.RedisService;
import com.lsh.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {


	@Autowired
    RedisService redisService;
	
    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("")
    public void doLogin() {

    }
    
//    @RequestMapping("/do_login")
//    @ResponseBody
//    public Result<Boolean> doLogin(HttpServletResponse response, @Valid LoginVo loginVo) {
//        log.info(loginVo.toString());
//        //登录
//        userService.login(response, loginVo);
//        return Result.success(true);
//    }
}
