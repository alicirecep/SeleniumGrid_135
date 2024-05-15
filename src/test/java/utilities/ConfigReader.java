package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties properties;

    static {
        String filePath = "configuration.properties";

        try {
            FileInputStream fis = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fis);

        } catch (FileNotFoundException e) {
            System.out.println("Configuration.properties can not be found");
        } catch (IOException e) {
            System.out.println(" Could not load properties File");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
