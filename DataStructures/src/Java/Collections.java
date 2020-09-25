package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String> ();
		al.add("one");
		al.add("Two");
		System.out.println(al.get(0));
		
		Vector<String> v = new Vector<String>();
		v.add("one");
		v.add("Two");
		System.out.println(v.get(0));
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Two");
		ll.addFirst("One");
		
		java.util.Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("one", "uno");
		hm.put("two", "duo");
		System.out.println(hm.get("one"));
	}

}
