package com.yf.web.ai.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author YangLF
 * @date 2018/1/17
 */
public class HttpUtil {

    public static String sendHttpGet(String path) {
        try {
            URL url = new URL(path);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            huc.setRequestMethod("GET");
            huc.connect();
            DataInputStream dis=new DataInputStream(huc.getInputStream());
            return dis.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
