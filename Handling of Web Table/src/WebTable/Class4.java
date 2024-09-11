package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class4 
{
	public static void main(String[] args) 
	{
		WebDriver m= new ChromeDriver();
		m.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> row = m.findElements(By.xpath("//table[@id='countries']//tr"));
		List<WebElement> che = m.findElements(By.xpath("//input[@type='checkbox']"));
		
		Actions mo= new Actions(m);
		
		for(WebElement o:che)
		{
			mo.click(o).perform();
			
			
		}
		
		
		
		System.out.println("-----------------------------------------");
		
		
		
		for(WebElement l:row)
		{
			System.out.println(l.getText()+ "                                   ");
			
		}
		
		System.out.println(row.size());
		
		
		
	}

}
