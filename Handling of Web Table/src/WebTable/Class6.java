package WebTable;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class6
{
	public static void main(String[] args)
	{
		WebDriver m = new  ChromeDriver();
		m.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> sd = m.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		int sdd = sd.size();
		System.out.println("CheckBox : "+sdd);
		
		List<WebElement> total = m.findElements(By.xpath("//table[@id='countries']//tr/td"));
		System.out.println("Total cell"+total.size());
		List<WebElement> country = m.findElements(By.xpath("//table[@id='countries']//tr/td[2]"));
		System.out.println(country.size()-1);
		
		Actions a= new Actions(m);
		for(int i=1;i<=country.size()-1;i++)
		{
			
			System.out.println(country.get(i).getText());
		}
		
		
		
		
	}
}
