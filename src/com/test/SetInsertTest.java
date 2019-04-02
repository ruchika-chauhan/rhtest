package com.test;

import java.util.HashSet;
import java.util.Set;

public class SetInsertTest {
public static void main(String[] args) {
	Set<Short> set=new HashSet<>();
	for(short s=0;s<10;s++) {
		set.add(s);
		set.remove(s-1);
	}
	System.out.println(set.size());
}
}
