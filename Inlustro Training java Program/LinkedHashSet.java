import java.util.*;
class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        set.add("vimal");
        set.add("kalai");
        set.add("mani");
        set.add("venki");
        
        //print all elements
        System.out.println(set);
        
        //iterate all elements
        for (String str : set){
            System.out.println("Element: "+str);
        }
        
        //delete all element inthe set
        set.clear();
        
        //after deleteing the set elements
        System.out.println(set);
    }
}