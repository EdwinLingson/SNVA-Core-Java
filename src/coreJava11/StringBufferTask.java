package coreJava11;

public class StringBufferTask {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" To Edwin"));
        System.out.println(sb.capacity());
        System.out.println(sb.delete(5,11));
        System.out.println(sb.capacity());
        System.out.println(sb.append(" Lingson"));
        System.out.println(sb.capacity() + " "+sb.length());
        System.out.println(sb.append(" Chalakkal"));
        System.out.println(sb.capacity() + " "+sb.length());
        System.out.println(sb.codePointAt(3));
        System.out.println(sb.insert(2,"Hi"));
        System.out.println(sb.indexOf("illo"));
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(7));
        sb.setCharAt(7,'C');
        System.out.println(sb.reverse());
        System.out.println(sb.replace(2,4,""));

        System.out.println("String Builder");
        StringBuilder sB = new StringBuilder("Hello World");
        System.out.println(sB);
        System.out.println(sB.capacity());
        System.out.println(sB.length());
        System.out.println(sB.append(" To Edwin"));
        System.out.println(sB.capacity());
        System.out.println(sB.delete(5,11));
        System.out.println(sB.capacity());
        System.out.println(sB.append(" Lingson"));
        System.out.println(sB.capacity() + " "+sB.length());
        System.out.println(sB.append(" Chalakkal"));
        System.out.println(sB.capacity() + " "+sB.length());
        System.out.println(sB.codePointAt(3));
        System.out.println(sB.insert(2,"Hi"));
        System.out.println(sB.indexOf("illo"));
        System.out.println(sB.reverse());
        System.out.println(sB.charAt(7));
        sB.setCharAt(7,'C');
        System.out.println(sB.reverse());
        System.out.println(sB.replace(2,4,""));
    }
}
