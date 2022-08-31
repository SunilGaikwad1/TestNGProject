package Resources;

import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass {
	
	public void browserLaunch() throws IOException {
		 
		//This will help us to read data.properties file
		FileInputStream fis= new FileInputStream("C:\\Users\\Sunil\\eclipse-workspace\\TestNgFramework\\src\\main\\java\\Resources\\data.properties");
		
		//This will access the data.properties
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browserName =prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunil\\Desktop\\Chromdriver\\chromedriver.exe");
		    	
			WebDriver driver = new ChromeDriver();
		    
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			//FireFox code
			
		}else if(browserName.equalsIgnoreCase("Edge")) {
			
			//Edge code
		}
		else {
			System.out.println("please select valid browser");
		}
	}

}
