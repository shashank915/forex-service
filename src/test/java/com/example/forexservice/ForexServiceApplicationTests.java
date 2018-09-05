package com.example.forexservice;

import com.example.forexservice.config.ForexServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ForexServiceApplication.class)
public class ForexServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

}
