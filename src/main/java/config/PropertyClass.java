package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {

    public static File propertyPath;
    public static FileInputStream fileInputStream = null;
    public static Properties properties = new Properties();

    public Properties readPropertiesFile() throws IOException {
        File fileName=null;
        FileInputStream fis = null;
        Properties prop = null;
        try {
            prop = new Properties();
            fileName=new File("D:\\RinggitPay\\Bills2U\\PROPERTY FILE\\Bills2U.Data.properties");
            fis = new FileInputStream(fileName);

            // create Properties class object
            if (fis != null) {
                // load properties file into it
                prop.load(fis);
            } else {
                throw new FileNotFoundException("property file '" + fileName + "' not found in the classpath");
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            fis.close();
        }

        return prop;
    }
}
