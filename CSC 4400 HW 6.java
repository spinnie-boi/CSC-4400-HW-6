/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
public class Main
{
	public static void main(String[] args) 
	{
	    int length = 100000;
	    int min = 0;
	    int max = 500;
		int[] ar = RandomizedArray(length, min, max);
		int[] duplicateArray = ar;
		long start = System.currentTimeMillis();
		BubbleSort(ar);
		long end = System.currentTimeMillis();
		long timeElapsed = end - start;
		System.out.println("Bubble sort took " + timeElapsed + " milliseconds.");
		start = System.currentTimeMillis();
		SelectionSort(duplicateArray);
		end = System.currentTimeMillis();
		timeElapsed = end - start;
		System.out.println("Selection sort took " + timeElapsed + " milliseconds.");
	}
	
	public static int[] RandomizedArray(int size, int start, int end)
	{
	    int[] theArray = new int[size];
	    Random r = new Random();
	    for(int i = 0; i < theArray.length; i++)
	    {
	        theArray[i] = Math.abs(r.nextInt() % end);
	        if(theArray[i] < start)
	        {
	            i--;
	        }
	    }
	    return theArray;
	}
	
	public static void BubbleSort(int[] theArray)
	{
	    for(int i = theArray.length - 1; i > 0; i--)
	    {
	        for(int j = 0; j < i; j++)
	        {
	            if(theArray[j] > theArray[j + 1])
	            {
	                int a = theArray[j];
	                int b = theArray[j + 1];
	                theArray[j] = b;
	                theArray[j + 1] = a;
	            }
	        }
	    }
	    return;
	}
	
	public static void SelectionSort(int[] theArray)
	{
	    for(int i = 0; i < theArray.length; i++)
	    {
	        for(int j = i; j < theArray.length; j++)
	        {
	            if(theArray[i] > theArray[j])
	            {
	                int a = theArray[i];
	                int b = theArray[j];
	                theArray[i] = b;
	                theArray[j] = a;
	            }
	        }
	    }
	    return;
	}
}
