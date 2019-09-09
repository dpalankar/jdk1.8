
package com.pattern.struct.adapter2;

public class AdapterPatternTest {

	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		MoniterAdapter moniterAdapter = new MoniterObjectAdapterImpl();
		Moniter samsung = getMoniter(moniterAdapter,3);
		Moniter sony = getMoniter(moniterAdapter,12);
		System.out.println("Samsung Moniter using Object Adapter="+samsung.getMoniter());
		System.out.println("Sony Moniter using Object Adapter="+sony.getMoniter());
	}

	private static void testClassAdapter() {
		MoniterAdapter sockAdapter = new MoniterClassAdapterImpl();
		Moniter samsung = getMoniter(sockAdapter,3);
		Moniter sony = getMoniter(sockAdapter,12);
		System.out.println("Samsung Moniter using Class Adapter="+samsung.getMoniter());
		System.out.println("Sony Moniter using Class Adapter="+sony.getMoniter());
	}
	
	private static Moniter getMoniter(MoniterAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.getSamsungMoniter();
		case 12: return sockAdapter.getSonyMoniter();
		default: return sockAdapter.getSamsungMoniter();
		}
	}
}
