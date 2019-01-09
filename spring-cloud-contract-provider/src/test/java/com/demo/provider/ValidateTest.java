package com.demo.provider;

import com.demo.provider.controller.UserInfoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by gloria on 15/12/2018.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ValidateTest {

    @Autowired
    private UserInfoController userInfoController;
    @Test
    public void test() throws Exception {
        userInfoController.getUserById(1L);
    }
}
