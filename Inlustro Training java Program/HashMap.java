import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<Integer , String> hm = new HashMap<>();
		
		hm.put(2,"vimal");
		hm.put(1,"vijay");
		hm.put(3,"ajay");
		
		System.out.println(hm);
		System.out.println(hm.get(2));
	}
}