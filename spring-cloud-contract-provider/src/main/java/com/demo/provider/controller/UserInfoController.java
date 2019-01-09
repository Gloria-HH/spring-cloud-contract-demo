package com.demo.provider.controller;

import com.alibaba.fastjson.JSONObject;
import com.demo.provider.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by gloria on 15/12/2018.
 */
@RestController
public class UserInfoController {

    @RequestMapping(value = "/getUserById/{id}", method = POST)
    public String getUserById(@PathVariable Long id) {
        User user = new User(id, "Test");
        return JSONObject.toJSONString(user);
    }

}
