package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;


public class WarehouseImpl implements Warehouse {
	
	private final Set<Product> warehouse= new HashSet<>();
	
	@Override
	public void addProduct(Product p) {
		this.warehouse.add(p);
	}

	@Override
	public Set<String> allNames() {
		final Set<String> names = new HashSet<>();
		for (final Product p : this.warehouse) {
			names.add(p.getName());
		}
		return names;
	}

	@Override
	public Set<Product> allProducts() {
		return new HashSet<>(this.warehouse);
	}

	@Override
	public boolean containsProduct(Product p) {
		return this.warehouse.contains(p);
	}

	@Override
	public double getQuantity(final String name) {
		for (final Product curr : this.warehouse) {
			if(curr.getName().equals(name)) {
				return curr.getQuantity();
			}
		}
		return 0;
	}

}
