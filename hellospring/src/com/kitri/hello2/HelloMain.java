package com.kitri.hello2;

public class HelloMain {

	public static void main(String[] agrs) {
//		HelloServiceKor helloServiceKor = new HelloServiceKor();
//		String msg = helloServiceKor.hellokor("노정탁");
		
//		HelloServiceEng helServiceEng = new HelloServiceEng();
//		String msg = helServiceEng.helloEng("Tak");
	
		HelloService helloService = new HelloServiceEng();
		//HelloService helloService = new HelloServiceKor();
		String msg = helloService.hello("노정탁");
		
		System.out.println(msg);
	}
	
	
}