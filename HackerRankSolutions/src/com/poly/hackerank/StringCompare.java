package com.poly.hackerank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringCompare {

	public static void main(String[] args) {
		getSmallestAndLargest("welcometojava", 3);
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
//	        ArrayList<String> a = new ArrayList();
		String[] a = new String[s.length()];
		try {

			for (int i = 0; i < s.length() - k + 1; i++) {
				System.out.println(i + ":" + (i + k));
				a[i] = s.substring(i, i + k);
//	            a.add(s.substring(i, i+k));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
//	        Collections.sort(a);
		System.out.println(a[1]);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println(a);
		smallest = a[0];
		largest = a[a.length - 1];
		System.out.println(smallest + "\n" + largest);
		return smallest + "\n" + largest;

	}
}
