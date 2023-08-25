package generalUtilites;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.util.Map;

public class ServerUtility {
    public static AppiumDriverLocalService service;
    
    public static void lunchServer() {
        /*Map<String,String>evn=new HashMap<String,String>(System.getenv());
        System.setProperty("ANDROID_HOME","/home/maria/Android/Sdk");
        System.setProperty("ANDROID_SDK_ROOT","/home/maria/Android/Sdk");*/
        System.setProperty("JAVA_HOME", "/usr/lib/jvm/java-11-openjdk-amd64");
        
        service = new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingPort(4723)
                          .withEnvironment(Map.of("ANDROID_HOME", "/home/maria/Android/Sdk", "ANDROID_SDK_ROOT", "/home/maria/Android/Sdk"))
                          .build();
        service.start();
    }
    public static void stopappiumServer() {
        try {
            service.stop();
        } catch (Exception e) {
            
            e.printStackTrace();
        } finally {
            
            System.out.println("Server close sucessfully");
        }
        
        
    }
}