package beans;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	private LinkedList fruits;
	private TreeSet cricketers;
	private Hashtable countrycap;
	private Properties statecap;

	public void setCountrycap(Hashtable countrycap) {
		System.out.println(countrycap.getClass().getCanonicalName());
		this.countrycap = countrycap;
	}

	public void setCricketers(TreeSet cricketers) {
		System.out.println(cricketers.getClass().getCanonicalName());
		this.cricketers = cricketers;
	}

	public void setFruits(LinkedList fruits) {
		System.out.println(fruits.getClass().getCanonicalName());
		this.fruits = fruits;
	}

	public void setStatecap(Properties statecap) {
		System.out.println(statecap.getClass().getCanonicalName());
		this.statecap = statecap;
	}

	public void printData() {
		System.out.println("Fruits=========");
		for (Object val : fruits) {
			System.out.println(val);
		}
		System.out.println("cricketers=======");
		for (Object val : cricketers) {
			System.out.println(val);
		}

		System.out.println("countrycap=======");
		Set keys = countrycap.keySet();
		for (Object key : keys) {
			System.out.println(key + "==" + countrycap.get(key));
		}
		System.out.println("statescap==========");
		keys = statecap.keySet();
		for (Object key : keys) {
			System.out.println(key + "==" + statecap.get(key));
		}
	}

}
