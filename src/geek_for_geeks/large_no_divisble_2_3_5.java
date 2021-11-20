package geek_for_geeks;

public class large_no_divisble_2_3_5 {
/*
 * Given a number, the task is to check if a number is divisible by 2, 3, and 5 or not.
 *  The input number may be large and it may not be possible to store even if we use long long int, 
 *  so the number is taken as a string.
*    Examples: 
 *
*
 *       Input : str = "725" 
 *         Output : NO
*
 *       Input : str = "263730746028908374890"
  *        Output : YES
  *        
  *        approch:
  *        
  *        A number is divisible by 2 if it’s right most digit is even and also a number is divisible by 5 if it’s right most digit is zero or five.
So, from above two observations, one can conclude that for the number to be divisible by both 2 and 5 the rightmost digit of the number must be zero.
Now, a number is divisible by 3 if the sum of its digits is divisible by three.
Therefore, a number will be divisible by all of 2, 3, and 5 if: 
 

Its rightmost digit is zero.
Sum of all of its digits is divisible by 3.
 */
	
	static int SumOfDigits(String str,
            int n)
{
int sum = 0;

for (int i = 0; i < n; i++)
sum += (int)(str.charAt(i) - '0');  //tricky remember; genearlly  we are subtracting ascii of 0
//from each character.

return sum;
}

//function to Check if a large number
//is divisible by 2, 3 and 5 or not
static boolean Divisible(String str,
              int n)
{
if (SumOfDigits(str, n) % 3 == 0 &&
str.charAt(n - 1) == '0')
return true;

return false;
}
	public static void main(String[] args) {
		
		String s="123";
		int n=(int)(s.charAt(0) - '0');
		System.out.println(n);
	}

}
