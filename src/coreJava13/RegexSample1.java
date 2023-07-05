package coreJava13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample1 {

    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;
        boolean found;
        pattern = Pattern.compile("Java");
        matcher = pattern.matcher("Core Java");
        found = matcher.matches();
        System.out.println("Testing java against Java");
        if (found) System.out.println("Matches");
        else System.out.println("Does not Match");
        System.out.println("=====================");
        boolean b = Pattern.matches("Java", "Java");
        if (b) System.out.println("Matches");
        else System.out.println("Not Found");
        System.out.println("=====================");
//        boolean b = Pattern.matches("Java","Java");
        if (matcher.find()) System.out.println("Matches");
        else System.out.println("Not Found");

        System.out.println("=====================");
        pattern = Pattern.compile("Java");
        matcher = pattern.matcher("Core Java, I like coding in Java");
//        boolean b = Pattern.matches("Java","Java");
        if (b) System.out.println("Matches");
        else System.out.println("Not Found");
        System.out.println("=====================");
//        boolean b = Pattern.matches("Java","Java");
        while (matcher.find()) {
            System.out.println("Found at index " + matcher.start());
        }
        System.out.println("=======ZZZZZZ==============");
        pattern = Pattern.compile("Z+");
        matcher = pattern.matcher("Z Zeb Zebra ZZZZZ ZZZZZZZ");
//        boolean b = Pattern.matches("Java","Java");

        while (matcher.find()) {
            System.out.println("Found at index " + matcher.start());
            System.out.println("Match: " + matcher.group());

        }
        System.out.println("=======Quantifier 2==============");
        pattern = Pattern.compile("Z.+b");
        matcher = pattern.matcher("Z Zeb Zebra ZZZZZ ZZZZZZZ");
//        boolean b = Pattern.matches("Java","Java");

        while (matcher.find()) {
//            System.out.println("Found at index " + matcher.start());
            System.out.println("Match: " + matcher.group());
        }
        System.out.println("=======Quantifier 3==============");
        pattern = Pattern.compile("e.+d");
        matcher = pattern.matcher("e ed extend extended");
//        boolean b = Pattern.matches("Java","Java");

        while (matcher.find()) {
//            System.out.println("Found at index " + matcher.start());
            System.out.println("Match: " + matcher.group());
        }
        System.out.println("=======Quantifier 4==============");
        pattern = Pattern.compile("e.+?d");
        matcher = pattern.matcher("ed ends here and  extend is extended");
//        boolean b = Pattern.matches("Java","Java");

        while (matcher.find()) {
//            System.out.println("Found at index " + matcher.start());
            System.out.println("Match: " + matcher.group());
        }
        System.out.println("=======Quantifier 5==============");
        pattern = Pattern.compile("e.?+d");
        matcher = pattern.matcher("ed ends here and  extend is extended");
//        boolean b = Pattern.matches("Java","Java");

        while (matcher.find()) {
//            System.out.println("Found at index " + matcher.start());
            System.out.println("Match: " + matcher.group());
        }
        System.out.println("=======Quantifier 6==============");
        pattern = Pattern.compile("[a-z]+");
        matcher = pattern.matcher("ed ends ABC FRG here and  extend is extended");
//        boolean b = Pattern.matches("Java","Java");

        while (matcher.find()) {
//            System.out.println("Found at index " + matcher.start());
            System.out.println("Match: " + matcher.group());
        }
        System.out.println("=======Quantifier 7==============");
        pattern = Pattern.compile("[A-Z]+");
        matcher = pattern.matcher("ed ends ABC FRG here and  extend is extended");
//        boolean b = Pattern.matches("Java","Java");

        while (matcher.find()) {
//            System.out.println("Found at index " + matcher.start());
            System.out.println("Match: " + matcher.group());
        }
        System.out.println("=======Quantifier 8==============");
        pattern = Pattern.compile("[0-9]+");
        matcher = pattern.matcher("ed ends1 A3BC FRG he8r9e and 564  extend is extended");
//        boolean b = Pattern.matches("Java","Java");

        while (matcher.find()) {
//            System.out.println("Found at index " + matcher.start());
            System.out.println("Match: " + matcher.group());
        }
    }
}
