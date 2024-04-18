package lecture12_Strings;

public class Palindrome {
	public static boolean palindrome(String str) {
		if(str.length()==0) {
			return false;
		}
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str="abcaba";
		System.out.println(palindrome(str));

	}

}
