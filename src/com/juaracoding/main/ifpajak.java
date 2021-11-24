package com.juaracoding.main;

import java.util.Scanner;

public class ifpajak {
	public static void main (String[] args) {

		String jenisKelamin = "wanita";
		boolean menikah = false;
		{
		int pajak = 0;
			
		if(jenisKelamin.equalsIgnoreCase("pria")) {
			if(menikah) {
				pajak = 5;
			}else {
				pajak = 10;
			}
		}else if (jenisKelamin.equalsIgnoreCase("wanita")){
			if(menikah) {
				pajak = 4;
			}else {
				pajak = 11;
			}
				pajak=10;
			}
		System.out.println("Anda berkelamin "+jenisKelamin+" dan anda memiliki pajak "+pajak);
		}
	}
}

