/* Write code for below problem. The input below is just an example and you should implement independent from the input. Please paste the link to the answer shared using pastebin, dotnetfiddle, jsfiddle, or any other similar web-site.
You will have an orthogonal triangle input from a file and you need to find the maximum sum of the numbers according to given rules below;

1. You will start from the top and move downwards to an adjacent number as in below.
2. You are only allowed to walk downwards and diagonally.
3. You can only walk over NON PRIME NUMBERS.
4. You have to reach at the end of the pyramid as much as possible.
5. You have to treat your input as pyramid.

According to above rules the maximum sum of the numbers from top to bottom in below example is 24.

      *1
     *8 4
    2 *6 9
   8 5 *9 3

As you can see this has several paths that fits the rule of NOT PRIME NUMBERS; 1>8>6>9, 1>4>6>9, 1>4>9>9
1 + 8 + 6 + 9 = 24.  As you see 1, 8, 6, 9 are all NOT PRIME NUMBERS and walking over these yields the maximum sum.

You can implement by using any programming language except Mathlab. Please paste the link to your code. */

public class MaxSum {
	         
	    static int x = 3;
	    static int maxSum(int pyr[][], int m, int n)
	    {
	     
	        for (int i = m - 1; i >= 0; i--)
	        {
	            for (int j = 0; j <= i; j++)
	            {
	                if (pyr[i + 1][j] > pyr[i + 1][j + 1])
	                    pyr[i][j] += pyr[i + 1][j];
	                else
	                   pyr[i][j] += pyr[i + 1][j + 1]; }
	        }
	        return pyr[0][0];
	    }
	    public static void main (String[] args)
	    {
	        int pyr[][] = { {1},
	                        {8, 4},
	                        {2, 6, 9},
	                        {8, 5, 9, 3}};
	        System.out.println ( maxSum(pyr, 3, 3));
	    }
	}
	 
