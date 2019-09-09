
package com.pattern.struct.adapter2;

//Using inheritance for adapter pattern
public class MoniterClassAdapterImpl extends Laptop implements MoniterAdapter{

	@Override
	public Moniter getSamsungMoniter() {
		return convertMoniter("Samsung");
	}

	@Override
	public Moniter getSonyMoniter() {
		return convertMoniter("Sony");
	}
	
	private Moniter convertMoniter(String type) {
		return new Moniter(type);
	}

}
