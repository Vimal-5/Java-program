import java.util.*;
class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        
        set.add("vimal");
        set.add("kalai");
        set.add("mani");
        set.add("venki");
        
        //print all elements
        System.out.println(set);
        
        //ptrint thr first elements
        System.out.println(set.first());
        
        //print the last elements
        System.out.println(set.last());
        
        //delete and print the first element
        System.out.println(set.pollFirst());
        
        //delete and print the last element
        System.out.println(set.pollLast());
        
        //higher element from the given value
        System.out.println(set.higher("vimal"));
        
        //lower and print the last elements
        System.out.println(set.lower("vimal"));
    }
}