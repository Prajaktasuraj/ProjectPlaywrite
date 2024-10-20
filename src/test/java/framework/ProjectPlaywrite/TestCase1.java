package framework.ProjectPlaywrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestCase1 {
	public static void main(String[] args) {
		
	//start server
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		BrowserContext context_1 = browser.newContext();
		Page page = context_1.newPage();
		page.navigate("https://www.google.com");
		
		playwright.close();
	}

}
