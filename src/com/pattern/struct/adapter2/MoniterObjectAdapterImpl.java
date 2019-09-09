
package com.pattern.struct.adapter2;

public class MoniterObjectAdapterImpl implements MoniterAdapter{

	//Using Composition for adapter pattern
	private Laptop laptop = new Laptop();
	
	@Override
	public Moniter getSamsungMoniter() {
		laptop.watch();
		return convertMoniter("Samsung");
	}
	
	@Override
	public Moniter getSonyMoniter() {
		laptop.watch();
		return convertMoniter("Sony");
	}

	
	private Moniter convertMoniter(String type) {
		return new Moniter(type);
	}
	
}
