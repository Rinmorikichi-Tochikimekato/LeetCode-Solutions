import java.util.ArrayList;
import java.util.List;

public class Solution {

	static List<String> list = new ArrayList<String>();
	public static void printStr(String str, int i, int j){
	
		if(i==j) {
			System.out.println(str);
			
		}else {
		
			for(int l=i;l<=j;l++) {
				str = swap(str,l,i);
				printStr(str,i+1,j);
			str = swap(str,l,i);
				
			}
		}
		
		
	}
	
	private static String  swap(String str, int l, int i) {
		// TODO Auto-generated method stub
		
		char string[] = str.toCharArray();
		char temp = string[l];
		string[l] = string[i];
		string[i] = temp;
		return String.valueOf(string);

	}

	public static void main(String[] args) {
		
		String str = "ABC";
		printStr(str,0,str.length()-1);
//		for(String string : list) {
//			System.out.println(string);
//		}
	}
	
	
}
