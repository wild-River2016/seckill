package com.lsh.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @ClassName MD5Util
 * @Description: TODO
 * @Author lsh
 * @Date 2019/6/9 20:47
 * @Version
 */
public class MD5Util {

    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }
    private static final String salt = "1a2b3c4d";

    /**
     * 将input输入的密码进行加密
     * @param inputPass
     * @return
     */
    public static String inputPassToFormPass(String inputPass) {
        String str = ""+salt.charAt(0)+salt.charAt(2) + inputPass +salt.charAt(5) + salt.charAt(4);
        System.out.println(str);
        return md5(str);
    }

    /**
     * 入库数据密码进行加密
     * @param formPass
     * @param salt
     * @return
     */
    public static String formPassToDBPass(String formPass, String salt) {
        String str = ""+salt.charAt(0)+salt.charAt(2) + formPass +salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }
    public static String inputPassToDbPass(String inputPass, String saltDB) {
        String formPass = inputPassToFormPass(inputPass);
        String dbPass = formPassToDBPass(formPass, saltDB);
        return dbPass;
    }

}
