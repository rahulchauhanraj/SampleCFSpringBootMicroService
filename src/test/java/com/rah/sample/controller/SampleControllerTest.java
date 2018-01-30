package com.rah.sample.controller;

import com.rah.sample.boot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class SampleControllerTest {

    @Inject private SampleController controller;

    @Test
    public void testSystemHealth() {
        ResponseEntity isGoogleSearchAlive = controller.healthCheck();
        assertTrue(isGoogleSearchAlive.getStatusCode() == HttpStatus.OK);
    }
}
