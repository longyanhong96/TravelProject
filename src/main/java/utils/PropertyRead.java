package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Description : 读properties文件
 *
 * @author lyh
 * @date 2020/5/6
 */
public class PropertyRead {

    public static Properties getProperties(String fileName) {
        Properties properties = new Properties();
        InputStream in = null;
        try {
            in = PropertyRead.class.getClassLoader().getResourceAsStream(fileName);
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return properties;
    }

    public static Map getMapProperties(String fileName) {
        Properties properties = getProperties(fileName);
        HashMap<Object, Object> mapProperties = new HashMap<>();
        Set<Object> keys = properties.keySet();
        for (Object key : keys) {
            Object value = properties.get(key);
            mapProperties.put(key, value);
        }
        return mapProperties;
    }

}
