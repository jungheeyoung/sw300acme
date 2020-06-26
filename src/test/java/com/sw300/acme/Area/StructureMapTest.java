package com.sw300.acme.Area;

import com.sw300.acme.AcmeApplication;
import com.sw300.acme.arProject.Area;
import com.sw300.acme.arProject.StructureMap;
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
public class StructureMapTest {
    private static String AREA_ENDPOINT = "http://localhost:8080/structureMaps";

    @Autowired
    private TestRestTemplate template;

    @Test
    public void structureMapTest() {
        StructureMap map = new StructureMap();
        Area areaClass = new Area();

        map.setArea(areaClass);
        map.setLat(10);
        map.setLng(10);
        map.setStructureId(10);

        template.postForEntity(AREA_ENDPOINT,map,StructureMap.class);

        ResponseEntity<StructureMap> courseGetResponse
                = template.getForEntity(AREA_ENDPOINT, StructureMap.class);

        //  assertEquals(courseGetResponse.getBody().getTitle(),course.getTitle());

        //  assertEquals(test, 10);
    }
}
