package hashtable;

import java.util.Hashtable;

public class hashTableClass {

	public hashTableClass() {
		// TODO Auto-generated constructor stub
	
	
	}
	
	public static void main(String [] args)
	{
		Hashtable<Integer, String> h1=new Hashtable<>();
		
		Hashtable<Integer, String> h2=new Hashtable<>();
		
	 	h1.put(1, "Test1");
		h1.put(2, "Test2");
		h1.put(3, "Test3");
		
		h2.put(4, "Test4");
		h2.put(5, "Test5");
		h2.put(6, "Test6");
		
		System.out.println("Hastable values for h1 are :"+h1);
		System.out.println("Hastable values for h2 are :"+h2);
		
		Hashtable<String, Integer> h3=new Hashtable<>();
		
		h3.put("Vishal", 11);
		h3.put("Gupta", 12);
		
		System.out.println("Size of the hashtable:"+h3.size());
		
		if (h3.containsKey("Vishal"))
		{
			Integer a=h3.get("Vishal");
			System.out.println("Vishal value is "+a);
		}
		
	}

}
