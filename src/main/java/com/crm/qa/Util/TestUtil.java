package com.crm.qa.Util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public void SwitchToFrame() {
		
		
		driver.switchTo().frame("mainpanel");
	}
}
