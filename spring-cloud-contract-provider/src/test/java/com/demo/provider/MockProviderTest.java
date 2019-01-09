package com.demo.provider;

import com.demo.provider.controller.UserInfoController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

/**
 * Created by gloria on 15/12/2018.
 */
public class MockProviderTest {
    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new UserInfoController());
    }
}