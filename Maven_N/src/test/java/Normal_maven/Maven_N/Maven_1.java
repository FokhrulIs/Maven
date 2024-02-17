package Normal_maven.Maven_N;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		String st=driver.getTitle();
		System.out.println(st);

	}

}
