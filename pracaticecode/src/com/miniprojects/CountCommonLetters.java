package com.miniprojects;
import java.util.Arrays;

public class CountCommonLetters {

	public static void main(String[] args) {

		String str1 = "akljeafea";
		String str2 = "asdkljhsfad";

		System.out.println(lettersCommon(str1, str2));

	}//end Main

	public static int lettersCommon(String str1, String str2) {

		int count = 0;

		//	We first sort the given Strings using another method called 'sortString'
		str1 = sortString(str1);
		str2 = sortString(str2);

		//	We then remove the repeats within the sorted string using a method called 'removeRepeatLetters'
		str1 = removeRepeatLetters(str1);
		str2 = removeRepeatLetters(str2);

		//	For simplicity, we store the lengths of both Strings here
		int len1 = str1.length();
		int len2 = str2.length();

		//	We count the number of letters in common between both Strings below and return the number of letters in common
		if(len1 >= len2) {
			for(int i = 0; i < len2; i++) {
				for(int j = 0; j < len1; j++) {
					if(str2.charAt(i) == str1.charAt(j))
						count++;
				}
			}
		}else {
			for(int i = 0; i < len1; i++) {
				for(int j = 0; j < len2; j++) {
					if(str1.charAt(i) == str2.charAt(j))
						count++;
				}
			}
		}

		return count;
	}

	//	Removes repeated letters in String (needs fixing)
	public static String removeRepeatLetters(String str) {

		//	'result' is used to store the String w/o repeated letters
		String strNoRepeat = "";

		//	Length of String given to method
		int len = str.length();

		//	Removing repeated letters from str1
		for(int i=0; i < len-1; i++) {
			if(!(str.charAt(i) == str.charAt(i+1)))
				strNoRepeat += str.charAt(i);
			if(i==len-2 && (!(str.charAt(len-2) == str.charAt(len-1))))
				strNoRepeat += str.substring(len-1);
		}

		return strNoRepeat;
	}

	//	Sorts Strings
	public static String sortString(String inputString) {

		char tempArray[] = inputString.toCharArray();

		Arrays.sort(tempArray);

		return String.valueOf(tempArray);
	}

}//end Class
