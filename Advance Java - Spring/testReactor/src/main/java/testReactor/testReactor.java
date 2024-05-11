package testReactor;

import reactor.core.publisher.Mono;

public class testReactor {
	
	public Mono<String> nameMono(){
		return Mono.just("Soumyajit Mondal").log();
	}
	
	public static void main(String[] args) {
		testReactor testObj = new testReactor();
		testObj.nameMono().subscribe(name -> System.out.println("My name is " + name));
	}

}
