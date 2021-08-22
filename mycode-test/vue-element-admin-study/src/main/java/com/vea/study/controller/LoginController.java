package com.vea.study.controller;

import com.vea.study.entity.User;
import com.vea.study.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@RestController
@CrossOrigin
@Api(tags = "用户管理相关接口")
public class LoginController {
    @ApiOperation("登录接口")
    @PostMapping("login")
    public ResultUtil login(@RequestBody User user){
        System.out.println("----------"+user);
        Map<String , Object> hashMap = new HashMap();
        hashMap.put("token","tokenValue");
        return ResultUtil.ok().data(hashMap);
    }

    @GetMapping("info")
    public ResultUtil info(@RequestParam("token") String token){
        System.out.println("token="+token);

        return ResultUtil.ok().data("roles", "[user]").data("name", "admin").data("id",123).data("avatar","asbsd");
    }

}
