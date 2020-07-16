package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class solutions {
	 public static String sortString(String inputString) 
	    { 
	        // convert input string to char array 
	        char tempArray[] = inputString.toCharArray(); 
	          
	        // sort tempArray 
	        Arrays.sort(tempArray); 
	          
	        // return new sorted string 
	        return new String(tempArray); 
	    } 

	public List< List<String>> getana(List<String> list){
		int i=0;
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(String string : list) {
			
			
			String string2=sortString(string);
			
			
			if(map.containsKey(string2)){
				map.get(string2).add(string);
			}else {
				List<String> listStrings = new ArrayList<String>();
				listStrings.add(string);
				map.put(string2, listStrings);
			}
			
			i=0;
		}
		List<List<String>> finalList = new ArrayList<List<String>>();
		for(Map.Entry<String,List<String> > entry: map.entrySet() ) {
			finalList.add(entry.getValue());
		}
		return finalList;
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
