package com.poly.hackerank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerJava {

	public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		try {
		 	   
		   //Reading Big Integer Values from STDIN
		   BigInteger a= sc.nextBigInteger();
		   BigInteger b= sc.nextBigInteger();
		    
		   //BigInteger Addition
		    System.out.println(a.add(b));
		    //BigInteger Multiplication
		    System.out.println(a.multiply(b));
		    
		    
		}catch (Exception e) {
			throw e;
		}
		finally {
			 sc.close();
		}
		   
	}

}
