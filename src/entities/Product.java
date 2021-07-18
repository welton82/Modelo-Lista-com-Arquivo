package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String name;
	private Double price;
	
	private Product product;
	List<Product>list = new ArrayList<Product>();
	
	
	public Product() {
		
	}


	public Product(String name, Double price) {
		
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product prt) {
		this.product = prt;
		list.add(product);
	}


	public void adicionar(Product product) {
		this.product = product;
		list.add(this.product);
	}

	
	public List<Product> getList() {
		for(Product p:list){
			System.out.println("Nome: " + p.getName());
			System.out.println("Price: " + p.getPrice());
		}
		return list;
	}


	


	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(Product p:list){
			//s.append("\n");
			s.append(p.getName());
			s.append(" ");
			s.append("Price: ");
			s.append(p.getPrice());
			s.append(" R$");
		}
		
	
		
		
		return s.toString();
	}
	
	
	
	
	
}
