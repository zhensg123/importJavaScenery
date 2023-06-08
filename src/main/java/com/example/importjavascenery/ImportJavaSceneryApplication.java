package com.example.importjavascenery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

interface saySome {
	String say();
}

interface checkAge {
	boolean check(int age) throws UnderAgeException;
}

class UnderAgeException extends Exception {
	public UnderAgeException(String message){
		super(message);
	}
}
@SpringBootApplication
public class ImportJavaSceneryApplication {
	public static void main(String[] args) throws UnderAgeException {
		saySome test = ()->"你好啊";
		System.out.println(test.say());

		checkAge c = (a)->{
			if(a < 18){
				throw new UnderAgeException("未满18岁");
			}else {
				return true;
			}
		};
//		System.out.println(c.check(12));
		SpringApplication.run(ImportJavaSceneryApplication.class, args);
	}

}
