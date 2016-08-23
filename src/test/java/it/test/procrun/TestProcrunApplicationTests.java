package it.test.procrun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestProcrunApplication.class)
@WebAppConfiguration
public class TestProcrunApplicationTests {

	@Test
	public void contextLoads() {
	}

}
