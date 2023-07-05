package coreJava13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample3 {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";
        String regex = "Jon.*?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll("Eric"));
        regex = "Jon.*? ";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll("Eric "));
        System.out.println("__________________________");
        pattern = Pattern.compile("[ ,.!@$]");
        String [] strs = pattern.split("I like$Java.Coding,in Java!is@Easy");
        int i=1;
        for (String s:strs) {
            System.out.println("Token " + i+ ":" + s);
            i++;

        }
    }
}
