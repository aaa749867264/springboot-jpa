package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		
		System.out.println("启动");   
		System.out.println("dev 练习提交版本 test"); 
		System.out.println("dev20190803 合并到master "); 
		SpringApplication.run(App.class, args);
	}
}
