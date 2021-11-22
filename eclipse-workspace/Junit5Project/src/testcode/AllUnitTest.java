package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import businesscode.JunitMessage;



@RunWith(JUnitPlatform.class)
@SelectClasses({DemoTest1.class,JunitMessage.class})
	class AllUnitTest
{
	
}

