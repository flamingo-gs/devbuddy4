package com.devbuddy4;

import com.devbuddy4.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Devbuddy4ApplicationTests {

	@Autowired
	private I18NService i18NService;

	@Test
	public void testMessageByLocalService() throws Exception{
		String expectedResult = "Bootstrap starter template1";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("doesn't match!",expectedResult,actual);
	}


}
