package com.jiange.duomikuai.common.utils;

public class StringUtils {
    /**
     * 判断字符串是否为null或空
     * @param str 字符串
     * @return true:为null或空，false:不为null且非空
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * 判断字符串是否不为null且非空
     * @param str 字符串
     * @return true:不为null且非空，false:为null或空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isALlNotEmpty(String... strs) {
        for (String str : strs) {
            if (isEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
