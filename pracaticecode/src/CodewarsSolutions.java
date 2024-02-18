
public class CodewarsSolutions {

	public static void main(String[] args) {

		System.out.println(toCamelCase("the-stealth-warrior"));
		System.out.println(toCamelCase("the_stealth_warrior"));

	}//end main
	
	private static String toCamelCase(String s) {
		String result = "";
		int line = 0;
		    
		while(s.contains("-")){
		    line = s.indexOf("-");
		    result += (s.substring(0, line) + String.valueOf(s.charAt(line+1)).toUpperCase());
		    s = s.substring(line+2);
		}
		    
		while(s.contains("_")){
		    line = s.indexOf("_");
		    result += (s.substring(0, line) + String.valueOf(s.charAt(line+1)).toUpperCase());
		    s = s.substring(line+2);
		}
		    
		return result + s;
	}

}//end class
