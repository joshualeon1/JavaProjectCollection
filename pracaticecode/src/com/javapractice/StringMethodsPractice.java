package com.javapractice;
/*	Here, we will be practicing the basics of the basics to better formulate different paths to code certain things. Such as 'String' methods like: .equals() and .substring(). Which we don't exactly know how to
 * 	use. So things such as these and other's will be practiced regardless of how easy or small the code is. The purpose is it have it 'memorized' by the end.
 */

public class StringMethodsPractice {

	public static void main(String[] args) {

		//.charAt() - returns the character at specified index
		String str = "String";
		System.out.println(str.charAt(2));	//returns 'r'

		System.out.println("-------------------------");

		//.compareTo() - compares two strings (Visit this cite for a better understanding: https://www.javatpoint.com/java-string-compareto)
		//Compares the String 'str' with 'str2'. Basically: if 'str' == 'str2' returns 0 | if 'str' > 'str2' returns 1 (positive num) | if 'str' < 'str2' returns -1 (neg num)
		String str2 = "Strin";
		System.out.println(str.compareTo(str2));	// returns 1

		System.out.println("------------------------");

		//.compareToIgnoreCase() - compares two strings, ignoring case differences (regardless of upper or lower case)
		//Compares two strings, but unlike 'compareTo()' this isn't case sensitive, meaning: 'STRING' and 'StRiNg' returns 0
		System.out.println(str.compareToIgnoreCase(str2));	//	returns 1

		System.out.println("------------------------");

		//.concat() - Appends a String to the end of another String
		String firstName = "John ";	//<-- has a space at the end btw
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));

		System.out.println("------------------------");

		//.contains() - checks whether a String contains a sequence of characters
		String myString = "Banana";
		String stringCheck = "nana";
		System.out.println(myString.contains(stringCheck));	//One way of checking
		System.out.println(myString.contains("na"));	//returns a boolean (true/false) if the String contains what is passed through '.contains', there are two methods of checking as shown.

		System.out.println("------------------------");

		//.contentEquals() - Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer (returns a boolean)
		String str3 = "Purple";
		String str4 = "Violet";
		String str5 = "Purp";
		String str6 = "Purple";
		System.out.println(str3.contentEquals(str4));		//false
		System.out.println(str3.contentEquals(str5));		//false
		System.out.println(str3.contentEquals(str6));		//true
		System.out.println(str3.contentEquals("Purple"));	//true

		System.out.println("------------------------");

		//.copyValueOf() - Returns a String that represents the characters of the character array
		char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
		String myStr2 = "";
		myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
		System.out.println("Returned String: " + myStr2);

		System.out.println("------------------------");

		//.endsWith() - Checks whether a string ends with the specified character(s) (returns a boolean)
		String start = "Alphabet";
		String stringChar = "t";
		System.out.println(start.endsWith(stringChar));

		System.out.println("------------------------");

		//.equals() - Compares two strings. Returns true if the strings are equal, and false if not (returns boolean)
		String str7 = "One";
		String str8 = "Zero";
		String str9 = "ONE";
		String str10 = "One";
		System.out.println(str7.equals(str8));	//false
		System.out.println(str7.equals(str9));	//false
		System.out.println(str7.equals(str10));	//true
		System.out.println(str7.equals("One"));	//true

		System.out.println("------------------------");

		//.equalsIgnoreCase() - Compares two strings, ignoring case considerations (returns boolean)
		System.out.println(str7.equalsIgnoreCase(str8));	//false
		System.out.println(str7.equalsIgnoreCase(str9));	//true
		System.out.println(str7.equalsIgnoreCase(str10));	//true
		System.out.println(str7.equalsIgnoreCase("One"));	//true

		System.out.println("------------------------");

		//.format() - Returns a formatted string using the specified locale, format string, and arguments
		String name = "sonoo";  
		String sf1 = String.format("name is %s", name);  
		String sf2 = String.format("value is %f", 32.33434);  
		String sf3 = String.format("value is %32.12f", 32.33434);	//returns 12 char fractional part filling with 0  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);

		System.out.println("------------------------");

		//.indexOf() - Returns the position of the first found occurrence of specified characters in a string (returns an int)
		String longString = "Encyclopedia";
		System.out.println(longString.indexOf("i"));	//The char 'i' is at index 10, (0 - 11) like an array

		System.out.println("------------------------");

		//.isEmpty() - Checks whether a string is empty or not
		String str11 = "";
		String str12 = "Hello";
		String str13 = " ";
		System.out.println(str11.isEmpty());	//true
		System.out.println(str12.isEmpty());	//false
		System.out.println(str13.isEmpty());	//false - (an empty space 'spacebar' counts as a char, meaning not empty, so false)

		System.out.println("------------------------");

		//.lastIndexOf() - Returns the position of the last found occurrence of specified characters in a string (returns an int)
		String fruit = "Banana";
		String animal = "Hipopotamus";
		System.out.println(fruit.lastIndexOf("a"));		//Last occurrence of 'a' is at index 5 in 'fruit' String variable
		System.out.println(animal.lastIndexOf("o"));	//Last occurrence of 'o' within 'animal' String variable is index 5

		System.out.println("------------------------");

		//.length() - Returns the length of a specified string
		String num = "ten";
		String num2 = "three";
		System.out.println(num.length());	//simply outputs the length of the String, 'ten' = 3
		System.out.println(num2.length());	//'three' = 5

		System.out.println("------------------------");

		//.replace() - Searches a string for a specified value, and returns a new string where the specified values are replaced
		String str14 = "Hello";
		System.out.println(str14.replace('l', 'p'));	//Basically, it replaces ALL instances of 'l', or whatever is the first parameter, with the second parameter, here it's 'p', output: 'Heppo'

		System.out.println("------------------------");

		//.replaceFirst() - Replaces the first occurrence of a substring that matches the given regular expression with the given replacement
		String quote = "This is how to replace a word.";
		System.out.println(quote.replaceFirst("word", "string"));	//Basically, the first parameter is what you're looking to replace in a string, the second parameter is what it will be replaced with.

		System.out.println("------------------------");

		//.replaceAll() - Replaces each substring of this string that matches the given regular expression with the given replacement
		String s1="Javatpoint is a very good website.";  
		String replaceString = s1.replaceAll("a","e");	//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString); 

		System.out.println("------------------------");

		//.split() - Splits a string into an array of substrings (needs to be more looked into)
		String str15 = "geekss@for@geekss";
		String[] arrOfStr = str15.split("s", 0);
		for (String a : arrOfStr)
			System.out.println(a);

		System.out.println("------------------------");

		//.startsWith() - Checks whether a string starts with specified characters
		String myStringValue = "Hello";
		System.out.println(myStringValue.startsWith("Hel"));	// true
		System.out.println(myStringValue.startsWith("Hell"));	// true
		System.out.println(myStringValue.startsWith("llo"));	// false
		System.out.println(myStringValue.startsWith("o"));		// false

		System.out.println("------------------------");

		//.substring() - Extracts the characters from a string, beginning at a specified start position, and through the specified number of character
		String str16 = new String("quick brown fox jumps over the lazy dog");
		System.out.println("Substring starting from index 15:");
		System.out.println(str16.substring(15));		//Starting at index 15 'inclusive' to the end of the String
		System.out.println("Substring starting from index 15 and ending at 20:");
		System.out.println(str16.substring(15, 20));	//Starting at index 15 'inclusive' to index 20 'exclusive'

		System.out.println("------------------------");

		//.toCharArray() - Converts this string to a new character array
		String s = "GeeksforGeeks";
		char[] gfg = s.toCharArray();
		for (int i = 0; i < gfg.length; i++)
			System.out.println(gfg[i]);

		System.out.println("------------------------");

		//.toLowerCase() - Converts a string to lower case letters
		String txt = "Hello World";
		System.out.println(txt.toLowerCase());

		System.out.println("------------------------");

		//.toUpperCase() - Converts a string to upper case letters
		System.out.println(txt.toUpperCase());

		System.out.println("------------------------");

		//.toString() - Returns the value of a String object
		Integer x = 5;
		System.out.println(x.toString());  
		System.out.println(Integer.toString(12));

		System.out.println("------------------------");

		//.trim() - Removes whitespace from both ends of a string
		String myS = "       Hello World!       ";
		System.out.println(myS);
		System.out.println(myS.trim());

		System.out.println("------------------------");

		//.valueOf() - Returns the string representation of the specified value
		int value=30;  
		String string1=String.valueOf(value);  
		System.out.println(string1+10);//concatenating string with 10
		double d = 102939939.939;
		boolean b = true;
		long l = 1232874;
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };
		System.out.println("Return Value : " + String.valueOf(d) );
		System.out.println("Return Value : " + String.valueOf(b) );
		System.out.println("Return Value : " + String.valueOf(l) );
		System.out.println("Return Value : " + String.valueOf(arr) );

		System.out.println("------------------------\nPractice Below:\n------------------------");

		//PRACTICE
		System.out.println(everyNth("Miracle", 2));

		System.out.println("------------------------");

		System.out.println(countXX("xxx"));

		System.out.println("------------------------");

		System.out.println(stringBits("Hello"));

	}//end main

	//	Returns a new String with every n letter removed, example:	n = 2; Miracle -> Mrce
	public static String everyNth(String str, int n) {
		String result = "";
		for (int i=0; i<str.length(); i = i + n) {
			result = result + str.charAt(i);	//<-- Apparently we can just add the String like this. We knew this, but we just forgot. MEMORIZE
		}
		return result;
	}

	//	Returns an int 'count' of every instance there is an "xx" or whatever string you use, within the String passed into the method
	public static int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.substring(i, i+2).equals("xx"))
				count++;
		}
		return count;
	}

	//	Returns a new String, where every 2nd letter is removed, unlike the 1st method outside 'Main', this is ALWAYS every 2nd letter
	public static String stringBits(String str) {
		String result = "";
		for (int i=0; i<str.length(); i+=2) {
			result += str.substring(i, i+1);
		}
		return result;
	}

}//end class
