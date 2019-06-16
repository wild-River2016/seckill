package com.lsh.controller;

import com.lsh.domain.MiaoshaUser;
import com.lsh.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author lsh
 * @Date 2019/6/15 20:43
 * @Version
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    @ResponseBody
    public Result<MiaoshaUser> info(Model model, MiaoshaUser user) {
        return Result.success(user);
    }

}
