package com.lx.boot.web;

import com.lx.boot.Application;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author shiny
 * @since 2016/10/18 11:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserControllerTest {

    private MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Before
    public void setMvc(){
        mvc= MockMvcBuilders.standaloneSetup(webApplicationContext).build();
    }

    @Test
    public void testTransaction() throws Exception {
        MvcResult result=mvc.perform(MockMvcRequestBuilders.get("/user/testTransaction?username=test&password=123456")
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        int status=result.getResponse().getStatus();
        Assert.assertTrue("正常返回",status==200);
    }

}