package com.yf.web.ai.util;

import com.baidu.aip.imageclassify.AipImageClassify;

/**
 * @author YangLF
 * @date 2018/1/17
 */
public class ImageClassifyUtil {
    private  static  final  String APP_ID="";
    private  static  final  String API_KEY="";
    private  static  final String SECRET_KEY="";

    public  static  void  classify(){
        AipImageClassify imageClassify=new AipImageClassify(APP_ID,API_KEY,SECRET_KEY);
    }

}
