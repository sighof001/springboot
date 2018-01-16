package lx.springboot.demo.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class TestBeanTest {
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject(){
		String expected = "from prod bean";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}
}
