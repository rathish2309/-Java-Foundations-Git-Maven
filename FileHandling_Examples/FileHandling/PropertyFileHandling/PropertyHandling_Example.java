package FileHandling_Examples.FileHandling.PropertyFileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling_Example {

    static void readDataFromPropertyFiles(String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);// FileInput Stream for reading data
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String name = properties.getProperty("name");
        System.out.println("name " + name);
    }


    public static void main(String[] args) throws IOException {
        readDataFromPropertyFiles("GitHubProfile.properties");
    }

}
