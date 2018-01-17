package com.yf.web.ai.util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * @author YangLF
 * @date 2018/1/17
 */
@Slf4j
public class HttpUtil {

    public static String sendHttpGet(String path, Map<String,Object> params) {
        try {
            StringBuffer buffer=new StringBuffer(path);
            if(params!=null){
                buffer.append("?");
                for (Map.Entry<String,Object> param : params.entrySet()){
                    buffer.append(param.getKey()+"="+param.getValue());
                    buffer.append("&");
                }
                buffer.replace(buffer.length()-1,buffer.length(),"");
            }

            URL url = new URL(buffer.toString());
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            huc.setRequestMethod("GET");
            huc.connect();
            int responseCode = huc.getResponseCode();
            if(responseCode== HttpStatus.OK.value()){
                DataInputStream dis=new DataInputStream(huc.getInputStream());
                byte [] bs=new byte[dis.available()];
                dis.read(bs);
                return new String(bs,"UTF-8");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
