import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("vimal");
        list.add("arun");
        list.add("ajay");
        list.add("vimal");
        list.remove(1);
        list.remove(String.valueOf("vimal"));
        System.out.println(list);
    }
}