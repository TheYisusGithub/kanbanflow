package core.selenium.webdrivers;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    private static Map<BrowserType,Browser> map = new HashMap<BrowserType, Browser>() {{
        put(BrowserType.CHROME, new Chrome());
        put(BrowserType.FIREFOX, new FireFox());
    }};

    public static Browser getBrowser(BrowserType type){
        return map.get(type);
    }
}
