package com.sheng.test;
/**
 * 
 * */
public class TestString {
	public static void main(String[] args){
		//method 1:直接使用字符串常量来构造String对象，编译期间字符串常量会直接放入常量池，所以s1和s2所指向的字符串其实是同一个，所以两句话都会打出来
//    	String s1 = "abc" + "def";
//    	String s2 = "abcdef";
    	
		//method 2：使用new的方式那么字符串对象是在堆上直接分布的，内存地址不同，所以只会打出值相同
    	String s1 = new String("abc") + new String("def");
    	String s2 = new String("abcdef");
    	
    	if(s1 == s2){
    		System.out.println("s1和s2的内存地址相同");
    	}
    	
    	if(s1.equals(s2)){
    		System.out.println("s1和s2的值相同");
    	}
	}
}
