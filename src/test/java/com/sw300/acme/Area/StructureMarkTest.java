package com.sw300.acme.Area;

import com.sw300.acme.AcmeApplication;
import com.sw300.acme.arProject.Area;
import com.sw300.acme.arProject.StructureMap;
import com.sw300.acme.arProject.StructureMark;
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
public class StructureMarkTest {
    private static String AREA_ENDPOINT = "http://localhost:8080/structureMarkes";

    @Autowired
    private TestRestTemplate template;

    @Test
    public void structureMapTest() {
        StructureMark structureMark = new StructureMark();

        structureMark.setMarkerId(10);
        structureMark.setMarkerPath("path");
        template.postForEntity(AREA_ENDPOINT,structureMark, StructureMark.class);

        ResponseEntity<StructureMark> courseGetResponse
                = template.getForEntity(AREA_ENDPOINT, StructureMark.class);

        //  assertEquals(courseGetResponse.getBody().getTitle(),course.getTitle());

        //  assertEquals(test, 10);
    }
}
