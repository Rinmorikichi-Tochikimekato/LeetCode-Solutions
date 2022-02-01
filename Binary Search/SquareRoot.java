// Given a non-negative integer x, compute and return the square root of x.

// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 

// Example 1:

// Input: x = 4
// Output: 2
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

// Constraints:

// 0 <= x <= 231 - 1

class Solution {
    public int mySqrt(int x) {
        /*
        * We will be using binary search approach in this solution
        * For example, if we have to find the square root of number 38
        * the sqrt of number 38 will be lying somewhere between 0-38 only
        * and this is in sorted form so we simply keep applying the binary search
        * and keep storing the closest possible if acurate result is not available
        * for that number
        */
        if(x==1) {
            return 1;
        }
        int low=0, high=x-1, ans=0;
        while(low<=high) {
            long mid = low + (high-low)/2;
            if(mid*mid == x) {
                return (int)mid;
            }
            else if(mid*mid < x) {
                ans = (int)mid;
                low = (int)mid+1;
            }
            else {
                high = (int)mid-1;
            }
        }
        return ans;
    }
}
