package aboutnet;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * @author ：wangh
 * @date ：Created in 2025/9/30 14:51
 * @description：网络编程之http
 * @modified By：
 * @version: 1.0.0
 */
public class AboutNetDemo {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.baidu.com");
        HttpURLConnection connection= (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setUseCaches(false);
        connection.setRequestProperty("Accept","*/*");
        connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Safari/537.36");
        connection.connect();
        System.out.println(connection.getResponseCode());
        if(connection.getResponseCode()!=200){
            throw new RuntimeException("请求失败");
        }
        Map<String, List<String>> map = connection.getHeaderFields();
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        InputStream inputStream= connection.getInputStream();
        byte[] bytes = new byte[1024];
        while(inputStream.read(bytes)!=-1){
            System.out.println(new String(bytes));
        }

    }

}
