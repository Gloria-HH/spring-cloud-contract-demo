package com.demo.customer.provider;

import com.alibaba.fastjson.JSONObject;
import com.demo.customer.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;

/**
 * Created by gloria on 15/12/2018.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureStubRunner(ids = {"com.demo:spring-cloud-contract-provider:+:stubs:8088"}, stubsMode = StubsMode.LOCAL)
public class ValidateContractTest {

    @Autowired
    private UserController userController;
    @Test
    public void validateUser() {

        String str=userController.user("1");
        JSONObject jsonObject=JSONObject.parseObject(str);
        assertThat(jsonObject.get("name")).isEqualTo("tes1");
    }

}
