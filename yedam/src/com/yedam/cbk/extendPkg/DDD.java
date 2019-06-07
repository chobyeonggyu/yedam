package com.yedam.cbk.extendPkg;

public class DDD {
public static void main(String[] args) {
	int num =1;
	int[][] ary = new int[5][5];
	for (int i = 0; i<5;i++) {
		for (int j =0; j<5; j++) {
			ary[i][j] = num++;
		}
	}
}
}
