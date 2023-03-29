package main;

@Service(name = "SuperMegaUltraClass")
public class SimpleService {
	
	@Init
	public static void initService() {
		System.out.println("Initializtaion");
	}
	
	public static void neInit() {
		System.out.println("Ne init method");
	}
}
