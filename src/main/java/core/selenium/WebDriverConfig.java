package core.selenium;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class WebDriverConfig {
    private String webBrowser;
    private String implicit;
    private String explicit;
    private static WebDriverConfig ourInstance = new WebDriverConfig();

    public static WebDriverConfig getInstance() {
        return ourInstance;
    }

    private WebDriverConfig() {
        try (InputStream input = new FileInputStream(System.getProperty("user.dir") + "/gradle.properties")) {
            Properties properties = new Properties();
            properties.load(input);

            webBrowser= properties.getProperty("browser");
            implicit = properties.getProperty("implicit");
            explicit = properties.getProperty("explicit");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getWebBrowser() {
        return webBrowser;
    }

    public String getImplicit() {
        return implicit;
    }

    public String getExplicit() {
        return explicit;
    }
}
