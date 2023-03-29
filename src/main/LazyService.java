package main;

@Service(name = "LazySuperClass", lazyLoad = true)
public class LazyService {
	
	@Init
	public static void risovalka(String s) {
		System.out.println(s);
	}
}
