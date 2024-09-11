package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) 
	{
		WebDriver m = new ChromeDriver();
		m.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> sd = m.findElements(By.xpath("//table[@id='countries']//tr"));
		System.out.println(sd.size());
		 int s = m.findElements(By.xpath("//table[@id='countries']//tbody/tr[5]/td")).size();
		System.out.println(s);
		
		// headers
	int sds = m.findElements(By.xpath("//table[@id='countries']//tbody/tr[1]/td/h3")).size();
	
	System.out.println(sds);
	String text = m.findElement(By.xpath("//table[@id='countries']//tr[8]/td[4]")).getText();
	
	System.out.println("Currency :"+text);
	
	}

}
