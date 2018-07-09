package com.libstar.kb.spider.sp.datadryad.util;

/**
 * @author itguang
 * @create 2018-07-09 16:46
 **/
public class DryadUtil {




    public static String getId(String contentUrl){

        if (contentUrl!=null){

            int i = contentUrl.lastIndexOf(".");
            return contentUrl.substring(i+1);

        }
        return null;
    }


}
