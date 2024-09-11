package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2
{
	public static void main(String[] args)
	{
	
		WebDriver m = new ChromeDriver();
		
		m.get("file:///D:/Table.html");
		 List<WebElement> sd = m.findElements(By.xpath("//table[@border='1']//tr[1]/th"));
	
		System.out.println(sd.size());
		
		String t = m.findElement(By.xpath("//table[@border='1']//tr[1]/th[2]")).getText();
	
		System.out.println(t);
		List<WebElement> col = m.findElements(By.xpath("//table[@border='1']//tr[1]/th"));
	
		for(WebElement o:col)
		{
			System.out.print(o.getText() + "   ");
			
		}
	
	}

}
