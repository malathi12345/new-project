package log.test;

import log.simple.BaseClass;

public class Flipkart extends BaseClass {
	@Override
	public void lanchChromeBrowser(String url) {
		
		super.lanchChromeBrowser("https://www.flipkart.com/");
	}
}
