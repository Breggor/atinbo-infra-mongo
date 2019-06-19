package com.atinbo.test.base;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:/applicationContext-base.xml", "classpath:/applicationContext-morphia.xml"
})
public class BaseTest extends AbstractJUnit4SpringContextTests {

}
