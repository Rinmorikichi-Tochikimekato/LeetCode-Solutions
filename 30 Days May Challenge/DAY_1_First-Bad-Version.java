/*
	@author = Mohit Nirwan

	We need to find the minimum number where the array corrodes or the first element that returns true,
	or it is a bad version

	we need to find a better approach than the Basic O(n) approach, and since the elements are sorted we could think of 
	of a log(N) solution. We would look in the direction of Binary Search Algorithm

	To need to convert this to a binary search problem, the essential intuition would be.

	We would check the Middle Element of the array everytime, since the answer would be found here

	When the API returns a TRUE, this could mean that this is the first bad version or the First Bad version would be a prior
	version to this Hence, the upper bound = middle element

	When the API returns a False, this could mean that this is the last false or last stable version, And you have a Bad version 
	just after this value. or You could find it after this value somewhere ahead, But never behind it. Hence you would assign 
	the lower bound = middle + 1

	And this would eventually lead up to the First True or first bad version 
*/



/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int i=1,j=n;
        int mid = 0;
            while(i<j){
                
                mid = (i/2+j/2);
                //System.out.println(mid);        
                //System.out.println(isBadVersion(mid));
                if( true == isBadVersion(mid) ){
                    j=mid;
                }else{
                    i=mid+1;
                }
                
            }
     
        return i;
    }
}