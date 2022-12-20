package beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
	// primitives
	private String name;
	private int age;
	private boolean isActive;
	// product
	private Product product;
	// List
	private List<String> items;
	// Set
	private Set<String> cards;
	// Map
	private Map<String, String> details;
	// primitive array
	private String[] mostLikedItems;
	

	public Customer(String name, int age, boolean isActive, Product product, List<String> items, Set<String> cards,
			Map<String, String> details, String[] mostLikedItems) {
		super();
		this.name = name;
		this.age = age;
		this.isActive = isActive;
		this.product = product;
		this.items = items;
		this.cards = cards;
		this.details = details;
		this.mostLikedItems = mostLikedItems;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public void setCards(Set<String> cards) {
		this.cards = cards;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

	public void setMostLikedItems(String[] mostLikedItems) {
		this.mostLikedItems = mostLikedItems;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", isActive=" + isActive + ", product=" + product
				+ ", items=" + items + ", cards=" + cards + ", details=" + details + ", mostLikedItems="
				+ Arrays.toString(mostLikedItems) + "]";
	}

}
