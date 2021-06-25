package com.silence.myblog.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName : PatternUtil
 * @Author : Silence
 * @Date: 2021/6/14 19:43
 * @Description : 正则工具类
 */
public class PatternUtil {
    /**匹配邮箱正则表达式*/
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     *
     * @param keyword
     * @return
     */
    public static Boolean validKeyword(String keyword) {
        String regex = "^[a-zA-Z0-9\u4E00-\u9FA5]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(keyword);
        return match.matches();
    }

    /**
     * 判断该邮箱字符串是否合法
     * @param emailStr 待判断的邮箱字符串
     * @return 如果合法则返回true，否则返回false
     */
    public static boolean isEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    /**
     * 判断该rul字符串是否合法
     * @param urlString 待判断的url字符串
     * @return 如果合法则返回true，否则返回false
     */
    public static boolean isURL(String urlString) {
        String regex = "^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+(\\?{0,1}(([A-Za-z0-9-~]+\\={0,1})([A-Za-z0-9-~]*)\\&{0,1})*)$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(urlString).matches()) {
            return true;
        } else {
            return false;
        }
    }
}
