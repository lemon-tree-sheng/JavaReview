package com.sheng.test;
/**
 * 
 * */
public class TestString {
	public static void main(String[] args){
		//method 1:ֱ��ʹ���ַ�������������String���󣬱����ڼ��ַ���������ֱ�ӷ��볣���أ�����s1��s2��ָ����ַ�����ʵ��ͬһ�����������仰��������
//    	String s1 = "abc" + "def";
//    	String s2 = "abcdef";
    	
		//method 2��ʹ��new�ķ�ʽ��ô�ַ����������ڶ���ֱ�ӷֲ��ģ��ڴ��ַ��ͬ������ֻ����ֵ��ͬ
    	String s1 = new String("abc") + new String("def");
    	String s2 = new String("abcdef");
    	
    	if(s1 == s2){
    		System.out.println("s1��s2���ڴ��ַ��ͬ");
    	}
    	
    	if(s1.equals(s2)){
    		System.out.println("s1��s2��ֵ��ͬ");
    	}
	}
}
