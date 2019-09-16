/*
 * @(#) BrowserFactory.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium.webdrivers;

import java.util.HashMap;
import java.util.Map;

/**
 * Class factory browser, this class let me select one driver browser according
 * a one value.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class BrowserFactory {
    private static Map<BrowserType, Browser> map = new HashMap<BrowserType, Browser>() {{
        put(BrowserType.CHROME, new Chrome());
        put(BrowserType.FIREFOX, new FireFox());
    }};

    /**
     * Contructor.
     */
    public BrowserFactory() {
    }

    /**
     * Method to let set a type of browser and return his driver.
     *
     * @param type BrowserType.
     * @return type driver.
     */
    public static Browser getBrowser(BrowserType type) {
        return map.get(type);
    }
}
