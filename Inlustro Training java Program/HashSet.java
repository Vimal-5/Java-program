import java.util.*;
class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("vimal");
        set.add("kalai");
        set.add("mani");
        set.add("venki");
        
        //print all elements
        System.out.println(set);
        
        //delete the element
        set.remove("kalai");
        
        //after deleteing the element printing all elements
        System.out.println(set);
        
        //the set is contain the element
        System.out.println(set.contains("vimal"));
        
        //size of the set
        System.out.println(set.size());
    }
}