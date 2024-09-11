package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 
{
	public static void main(String[] args)
	{
		WebDriver m = new ChromeDriver();
		m.get("file:///D:/Table.html");
		List<WebElement> row = m.findElements(By.xpath("//table[@border='1']//tr"));
		
		
		System.out.println(row.size());
		
		for(int i=0;i<=row.size()-1;i++)
		{
			System.out.println(row.get(i).getText()+ "  ");
		}
		
		System.out.println("-------------------------------------------------");
		
		for(WebElement O:row)
		{
			System.out.println(O.getText()+ "  ");
		}
		
		
		
	}

}
