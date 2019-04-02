package com.test;

public class FinallyTest {
public static void main(String[] args) {
	try {
		System.out.println("1");
		System.exit(0);
		System.out.println("2");
	}
	finally {
		System.out.println("3");
	}
}
}
