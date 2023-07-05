package coreJava12;

import java.util.*;

import static java.lang.Thread.sleep;

public class CollectionTask {
    static void listExamples(){
        StopWatch stopwatch = new StopWatch();
        //Without Generics
        stopwatch.start();
        List a = new ArrayList();
        a.add(1996);
        a.add("November");
        a.add(3);
//        sleep(2);
        stopwatch.end();
        System.out.println(stopwatch.timeTaken());
        System.out.println(a);
        stopwatch.start();
        //With Generics
        List b = new ArrayList<String>();
        b.add(1996);
        b.add("November");
        b.add(3);
//        sleep(2);
        stopwatch.end();
        System.out.println(stopwatch.timeTaken());
        //With Generics both sides
        System.out.println(b);
        List<String> c = new ArrayList<String>();
        c.add("1996");
        c.add("November");
        c.add("3");
//        sleep(2);
        stopwatch.end();
        System.out.println(stopwatch.timeTaken());
        System.out.println(c);
        //LinkedList
        List<String> d = new LinkedList<>();
        d.add("1996");
//        d.add(1996);
        d.add("November");
        d.add("3");
//        sleep(2);
        stopwatch.end();
        System.out.println(stopwatch.timeTaken());
        System.out.println(d);
        //HashSet
        Set<String> e = new HashSet<>();
        e.add("1996");
        e.add("November");
        e.add("3");
//        sleep(2);
        stopwatch.end();
        System.out.println(stopwatch.timeTaken());
        System.out.println(c);
        stopwatch.start();
        Iterator iterator = e.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        stopwatch.end();
        System.out.println(stopwatch.timeTaken());
        //Treeset
        Set<String> f = new TreeSet<>();
        f.add("1996");
        f.add("November");
        f.add("3");
//        sleep(2);
        stopwatch.end();
        System.out.println(stopwatch.timeTaken());
        System.out.println(c);
        stopwatch.start();
        iterator = f.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        stopwatch.end();
        System.out.println(stopwatch.timeTaken());
    }
    static void mapExampels(){
        System.out.println("Hash Map");
        HashMap<Integer,String > map = new HashMap<Integer,String>();
        StopWatch stopwatch = new StopWatch();
        //Without Generics
        stopwatch.start();
        map.put(100,"Bala");
        map.put(101,"Sam");
        map.put(102,"Harry");
        map.put(103,"Edwin");
        map.put(104,"Chacko");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iter = set.iterator();
        System.out.println("While");
        while (iter.hasNext()){
            Map.Entry e = iter.next();
            System.out.println(e.getKey() + " " +e.getValue());
        }
        System.out.println("For");
        for (Map.Entry e: map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        stopwatch.end();
        System.out.println("Time Taken: "+ stopwatch.timeTaken());
        System.out.println("Tree Map");
        TreeMap<Integer,String > tmap = new TreeMap<>();
        stopwatch.start();
        tmap.put(105,"Bala");
        tmap.put(104,"Sam");
        tmap.put(103,"Harry");
        tmap.put(102,"Edwin");
        tmap.put(101,"Chacko");
        Set<Map.Entry<Integer,String>> tset = tmap.entrySet();
        Iterator<Map.Entry<Integer, String>> tIter = tset.iterator();
        System.out.println("While");
        while (tIter.hasNext()){
            Map.Entry e = tIter.next();
            System.out.println(e.getKey() + " " +e.getValue());
        }
        System.out.println("For");
        for (Map.Entry e : tmap.entrySet()
             ) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        stopwatch.end();
        System.out.println("Time Taken: "+ stopwatch.timeTaken());
        System.out.println("LinkedHashMap");
        LinkedHashMap<Integer,String > lhmap = new LinkedHashMap<>();
        stopwatch.start();
        lhmap.put(100,"Bala");
        lhmap.put(101,"Sam");
        lhmap.put(102,"Harry");
        lhmap.put(103,"Edwin");
        lhmap.put(104,"Chacko");
        Set<Map.Entry<Integer,String>> lhset = lhmap.entrySet();
        Iterator<Map.Entry<Integer, String>> LhIter = lhset.iterator();
        System.out.println("While");
        while (LhIter.hasNext()){
            Map.Entry e = LhIter.next();
            System.out.println(e.getKey() + " " +e.getValue());
        }
        System.out.println("For");
        for (Map.Entry m: lhmap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        stopwatch.end();
        System.out.println("Time Taken: "+ stopwatch.timeTaken());
        // Returns a stream consisting of the elements of this stream, sorted according to natural order.
        // If the elements of this stream are not Comparable, a java.lang.ClassCastException may be thrown when the terminal operation is executed.
        //For ordered streams, the sort is stable. For unordered streams, no stability guarantees are made.
        lhmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("Comparator 1");
        lhmap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("Comparator 2");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
    public static void main(String[] args) throws InterruptedException {
//        listExamples();
        mapExampels();

    }
}
