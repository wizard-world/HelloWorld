package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    
    private static String str = "abcccccccccc";
    private static String str1 = "";

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pattern p = Pattern.compile("^\\w+([A-Za-z0-9/:;_.-]\\S)*");
        Matcher m = p.matcher((CharSequence) str);
        boolean b = m.matches();
        System.out.println(b);
        
    }

}
