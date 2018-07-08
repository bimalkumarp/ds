package Test;

public class ReverseString {

	public static void main(String[] args) {
		 System.out.println(reverse("Bimal"));
	}

	private static String reverse(String str) {
		 
		if(str.length()==1){
			return str;
		}
		return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
		
	}

}
