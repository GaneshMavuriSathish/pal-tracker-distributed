package test.pivotal.pal.tracker.allocations;

import io.pivotal.pal.tracker.allocations.App;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AllocationsAppTest {

    @Test
    public void embedded() {
        App.main(new String[]{});

        List response = new RestTemplate().getForObject("http://localhost:8181/allocations?projectId=0", List.class);
        assertEquals(0, response.size());
//        assertThat(response).isEqualTo("[]");
    }
}
