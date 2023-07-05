package coreJava13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample2 {
    public static void main(String[] args) {
        String str = "A wise monkey is a monkey that doesn't monkey with another monkey's monkey.";
        String regex ="monkey";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(str);

        if(matcher.find()){
            System.out.println("Found");
        }
        else System.out.println("Not Found");

        while (matcher.find()){
            System.out.println(matcher.group() + " is matched from "+ matcher.start() + " to "+ matcher.end() );
        }
        System.out.println(matcher.replaceAll("donkey"));
    }
}
