package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {
	
	private final String name;
	private final double quantity;
	
	ProductImpl(final String name, final double q) {
		this.name = name;
		this.quantity = q;
	}
	

	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public double getQuantity() {
	
		return this.quantity;
	}
	public int hashCode() {
		return this.name.hashCode();
	}
	
	public boolean equals(Object o) {
		if(o instanceof Product) {
			final var p = (Product) o;
			return this.getName().equals(p.getName());
		}
		return false;
	}
	
	public String toString() {
		return "[" + this.getName() + "--Quantity: " + this.getQuantity() + "]";
	}
}
