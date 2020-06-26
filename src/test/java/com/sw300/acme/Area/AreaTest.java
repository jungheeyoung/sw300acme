package com.sw300.acme.Area;

import com.sw300.acme.AcmeApplication;
import com.sw300.acme.arProject.Area;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AcmeApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AreaTest {

    private static String AREA_ENDPOINT = "http://localhost:8080/areas";

    @Autowired
    private TestRestTemplate template;
    @Test
    public void listUser(){

    }
    @Test
    public void areaCountTest() {
        Area areaClass = new Area();

        template.postForEntity(AREA_ENDPOINT,areaClass,Area.class);

        ResponseEntity<Area> courseGetResponse
                = template.getForEntity(AREA_ENDPOINT, Area.class);

      //  assertEquals(courseGetResponse.getBody().getTitle(),course.getTitle());

      //  assertEquals(test, 10);
    }
}
