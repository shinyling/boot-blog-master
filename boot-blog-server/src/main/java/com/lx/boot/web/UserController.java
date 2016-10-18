package com.lx.boot.web;

import com.lx.boot.domain.User;
import com.lx.boot.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author shiny
 * @since 2016/10/17 18:10
 */
@RestController
@RequestMapping("/user")
@Api("用户相关")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("添加用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="username",dataType = "String",required = true,value = "用户名",defaultValue = "shiny"),
            @ApiImplicitParam(paramType = "query",name="password",dataType = "String",required = true,value = "密码",defaultValue = "666666")
    })
    @ApiResponses({
            @ApiResponse(code = 400,message="请求参数错误"),
            @ApiResponse(code = 404,message = "请求路径错误或跳转错误")
    })
    @RequestMapping(value = "addUser",method = RequestMethod.GET)
    public boolean addUser(@RequestParam("username")String username, @RequestParam("password")String password){
        return userService.addUser(username,password);
    }

    @ApiOperation("测试事物")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="username",dataType = "String",required = true,value = "用户名",defaultValue = "shiny"),
            @ApiImplicitParam(paramType = "query",name="password",dataType = "String",required = true,value = "密码",defaultValue = "666666")
    })
    @ApiResponses({
            @ApiResponse(code = 400,message="请求参数错误"),
            @ApiResponse(code = 404,message = "请求路径错误或跳转错误")
    })
    @RequestMapping(value = "testTransaction",method = RequestMethod.GET)
    public void testTransaction(@RequestParam("username")String username,@RequestParam("password")String password){
        userService.testTransaction(username,password);
    }
}
