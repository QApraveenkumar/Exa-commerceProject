package generalUtilites;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Listeners(Listner.class)
public class BaseClass extends ServerUtility {
    public String Platformname = "Android";
    public static AppiumDriver driver;
    public static JSONParser parser;
    
    @BeforeClass
    public void StartServer() {
        lunchServer();
    }
    
    @BeforeMethod
    public void GetData() throws IOException, ParseException, InterruptedException {
        if (Platformname.equalsIgnoreCase("Android")) {
            parser = new JSONParser();
            try {
                JSONObject config = (JSONObject) parser.parse(new FileReader("src/main/resources/Local_config.json"));
                JSONObject capabilitiesJSON = (JSONObject) config.get("Android_capabilities");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                // Set each capability from the JSON object
                for (Object key : capabilitiesJSON.keySet()) {
                    String capabilityKey = (String) key;
                    String capabilityValue = (String) capabilitiesJSON.get(key);
                    capabilities.setCapability(capabilityKey, capabilityValue);
                }
                driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub/"), capabilities);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(2000);
            
        } else if (Platformname.equalsIgnoreCase("IOS")) {
            parser = new JSONParser();
            try {
                JSONObject config = (JSONObject) parser.parse(new FileReader("src/main/resources/Local_config.json"));
                JSONObject capabilitiesJSON = (JSONObject) config.get("Ios_capabilities");
                // JSONObject capabilitiesIOS=(JSONObject) config.get("capabilitiesIOS");
                // Initialize the capabilities
                DesiredCapabilities capabilities = new DesiredCapabilities();
                // Set each capability from the JSON object
                for (Object key : capabilitiesJSON.keySet()) {
                    String capabilityKey = (String) key;
                    String capabilityValue = (String) capabilitiesJSON.get(key);
                    capabilities.setCapability(capabilityKey, capabilityValue);
                }
                driver = new IOSDriver(new URL("http://localhost:472/wd/hub/"), capabilities);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(2000);
            
        } else {
            parser = new JSONParser();
            JSONObject config = (JSONObject) parser.parse(new FileReader("src/main/resources/Bs_Config.json"));
            DesiredCapabilities capabilities = new DesiredCapabilities();
            
            JSONArray envs = (JSONArray) config.get("environments");
            Map<String, String> envCapabilities = (Map<String, String>) envs.get(0);
            Iterator it = envCapabilities.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
            }
            
            Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
            it = commonCapabilities.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if (capabilities.getCapability(pair.getKey().toString()) == null) {
                    capabilities.setCapability(pair.getKey().toString(), pair.getValue());
                }
            }
            
            String username = System.getenv("BROWSERSTACK_USERNAME");
            if (username == null) {
                username = (String) config.get("username");
            }
            
            String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
            if (accessKey == null) {
                accessKey = (String) config.get("access_key");
            }
            
            String app = System.getenv("BROWSERSTACK_APP_ID");
            if (app != null && !app.isEmpty()) {
                capabilities.setCapability("app", app);
            }
            
            driver = new AndroidDriver(new URL("http://" + username + ":" + accessKey + "@" + config.get("server") + "/wd/hub"), capabilities);
            //login button click
            driver.findElement(By.xpath("//android.widget.Button[@content-desc='LOGIN']")).click();
            
            //welcome page
            
            WebElement login = driver.findElement(By.className("android.widget.EditText"));
            login.click();
            login.sendKeys("6360692026");
            driver.findElement(By.className("android.widget.CheckBox")).click();
            driver.findElement(By.className("android.widget.Button")).click();
            
        }
    }
    
    @AfterMethod
    public void appClose() {
        System.out.println("Application is closed successfully");
        driver.closeApp();
        
    }
    
    @AfterClass
    public void StopeServer() {
        stopappiumServer();
    }
}
