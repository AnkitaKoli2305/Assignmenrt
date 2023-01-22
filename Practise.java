package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class Practise {

	public static void main(String[] args) {
		
		ArrayList<String>names= new ArrayList<String>();
	    names.add("Ankita");
	    names.add("Akshay");
	    names.add("Supi");
	    names.add("kondu");
	    names.add("pratiksha");
	    names.add("rohini");
	    
	    names.remove(3);
	    System.out.println(names);
	    
	    Vector<String> Vector= new Vector<>();
	    Vector.addAll(names);
	    
	    System.out.println("vector"+Vector);
	    
	    for(String str: names)
	    {
	    	System.out.println(str+"/t"+str.length());
	    	
	    }
	    //String Buffer br=new String Buffer(str);
	    //System.out.println(br.reserve());
	 System.out.println("*************************************");   
    HashSet<Double> nms= new HashSet<>();
    nms.add(14.14);
    nms.add(52.12);
    nms.add(35.46);
    nms.add(85.63);
    nms.add(89.63);
    
    System.out.println(nms);
    System.out.println(nms.contains(85.63));

	}

}
