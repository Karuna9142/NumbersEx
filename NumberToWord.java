package com.numbers;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:-");
		int num = sc.nextInt();
		
		if(num<1 || num>999)
		{
			System.out.println("Wrong input");
		}
		else
		{
			int last_digit = num%10; //last digit
			int n = num/10;
			int sec_digit = n%10;//second last digit
			int first_digit = num/100; // first digit
			
			String one[] = {" ",  "one","two","three", "four","five","six","Seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			String tens[] = {" ", "Ten","Twenty","Thirty","Forty","Fifty", "Sixty","Seventy","Eighty","Ninety"};
			String hw = "Hundred";
			
			if(num<20) //till 19
				System.out.println(one[num]);
			else if(num<100)
			{
				System.out.println(tens[sec_digit]+ " "+one[last_digit]);
			}
			else
			{
				System.out.println(one[first_digit]+ " " +hw+ " "+tens[sec_digit]+ " "+one[last_digit]);
			}
		}
	}

}
