/*
 * The gray code is a binary numeral system where two successive values differ in only one bit.

 * Given a non-negative integer n representing the total number of bits in the code, print the 
 * sequence of gray code. A gray code sequence must begin with 0.

 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 */
package info.mitcc.leetcode;

import java.util.ArrayList;

public class GrayCode {
/*	public ArrayList<Integer> grayCode(int n) {
		int len = (int) Math.pow(2, n);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(n == 1) {
			list.add(0);
			list.add(1);
			return list;
		}
		ArrayList<Integer> tempList = grayCode(n - 1);
		String[] gray1 = new String[len / 2];
		String[] gray2 = new String[len / 2];
		for(int i = 0; i < len / 2; i++) {
			gray1[i] = "0" + Integer.toBinaryString(tempList.get(i));
			gray2[len / 2 - 1 - i] = "1" + Integer.toBinaryString(tempList.get(i));
		}
		for(int i = 0; i < len / 2; i++)
			list.add(Integer.parseInt(gray1[i], 2));
		for(int i = 0; i < len / 2; i++)
			list.add(Integer.parseInt(gray2[i], 2));
		return list;
    }*/
	
/*	public ArrayList<Integer> grayCode(int n) {
		int len = (int) Math.pow(2, n);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(n == 1) {
			list.add(0);
			list.add(1);
			return list;
		}
		ArrayList<Integer> pre = grayCode(n - 1);
		for(int i = 0; i < len / 2; i++) {
			String temp = Integer.toBinaryString(pre.get(i));
			if(i % 2 == 0) {
				list.add(Integer.parseInt(temp + "0", 2));
				list.add(Integer.parseInt(temp + "1", 2));
			} else {
				list.add(Integer.parseInt(temp + "1", 2));
				list.add(Integer.parseInt(temp + "0", 2));
			}	
		}
		return list;
	}*/
	public ArrayList<Integer> grayCode(int n) {
		int len = 1 << n;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < len; i++)
			list.add(i ^ (i / 2));
		return list;
	}
	public static void main(String[] args) {
		System.out.println(new GrayCode().grayCode(4));
	}
}