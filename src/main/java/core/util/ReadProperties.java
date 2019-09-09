package core.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    private String userName;
    private String password;
    private String url;
    private static ReadProperties ourInstance = new ReadProperties();

    public static ReadProperties getInstance() {

        return ourInstance;
    }

    private ReadProperties() {
        try (InputStream input = new FileInputStream(System.getProperty("user.dir") + "/application.properties")) {
            Properties properties = new Properties();
            properties.load(input);

            userName = properties.getProperty("user_name");
            password = properties.getProperty("password_n");
            url = properties.getProperty("url");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

}
