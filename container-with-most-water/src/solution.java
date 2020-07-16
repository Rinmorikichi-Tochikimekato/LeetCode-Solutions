
class solution {
	
	    static public int maxArea(int[] height) {
	        
	        int first = 0;
	        int last = height.length - 1 ;
	            
	        int max = Math.min(height[first],height[last]) * (height.length - 1);
	        
	        while(first != last) {
	        	
	        	if(first < last) {
	        		first++;
	        	}else {
	        		last--;
	        	}
	        System.out.println(max);
	        max = Math.max(max, (Math.min(height[first],height[last]) * (last-first) ) );
	        	
	        	
	        }
	        
	        return max;
	    }
	    
	    public static void main(String[] args) {
			
	    	int[] array = {1,8,6,2,5,4,8,3,7};
	    	System.out.println(maxArea(array));
		}
	    
	}

