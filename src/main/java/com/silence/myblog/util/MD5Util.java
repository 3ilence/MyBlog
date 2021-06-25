package com.silence.myblog.util;

import java.security.MessageDigest;

/**
 * @ClassName : MD5Util
 * @Author : Silence
 * @Date: 2021/6/14 19:42
 * @Description : MD5加密工具类
 */
public class MD5Util {
    /**
     * 将byte数组转换为16进制数，每一个16进制数实际上是一个字符串，连接得到最终字符串
     * @param b byte类型数组
     * @return 转换完成得到的16进制数字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        //应该是没有并发的情况，可以使用StringBuilder
        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < b.length; i++)
            resultSb.append(byteToHexString(b[i]));
        return resultSb.toString();
    }

    /**
     * 将10进制的byte数据转换为16进制数
     * @param b byte类型数据
     * @return 转换后的16进制数字符串
     */
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n += 256;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    /**
     *
     * @param origin 加密前字符串
     * @param charsetname 字符集
     * @return md5加密后的字符串
     */
    public static String MD5Encode(String origin, String charsetname) {
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetname == null || "".equals(charsetname))
                //传入的数据需要转化为指定编码的字节数组
                //再将字节数组转换为16进制
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            else
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
        } catch (Exception e) {
        }
        return resultString;
    }
    /**16进制常量*/
    private static final String hexDigits[] = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
}
