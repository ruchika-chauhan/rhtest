package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
public static void main(String[] args) {
	Integer[] arr= {1,2,3};
	List<Integer> list=new ArrayList<>();
	list=Arrays.asList(arr);
	System.out.println(list);
	list.set(0, 3);
	System.out.println(list);
	list.add(1);// This line throw UnsupportedOperationException because Arrays.asList() 
	//method return a fixed size list . basically internally pointing to the specified array.
	System.out.println(list);
}
}
/*output:
	[1, 2, 3]
	[3, 2, 3]
	Exception in thread "main" java.lang.UnsupportedOperationException
				at java.util.AbstractList.add(Unknown Source)
				at java.util.AbstractList.add(Unknown Source)
				at com.test.ArrayListTest.main(ArrayListTest.java:15)*/