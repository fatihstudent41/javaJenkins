package singeltonpck;

import java.util.ArrayList;
import java.util.List;

public class singeltonSample {

	public static void main(String[] args) {
    System.out.println("Singelton class sample");
    
    
    List<String> list1 = new ArrayList<>();
    
    list1.add("a1");
    list1.add("a2");
    list1.add("a3");
    list1.add("a4");
    
    for (String s1 : list1) {
		System.out.println(s1.toString());
	}
    
    singclls.getinstance().test();
    System.out.println(singclls.getinstance().conStr);

	}

}
