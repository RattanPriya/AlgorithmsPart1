# AlgorithmsPart1
Practising the Algorithms Part 1 by Dr. Rob Sedgewick

package Test;

public class MinElement<Item>{
	
	public Comparable findMin(Comparable[] arrayofItems)
	{
		Comparable min;
		
		if(arrayofItems.length==0)
		{
			//Handling Empty Array Case
			System.out.println("Array is Empty");
			return null;
		}
		else min = arrayofItems[0];
		
		
		for(int i=0; i < arrayofItems.length; i++)
		{
			if(less(arrayofItems[i],min)) 
			{
				 min = arrayofItems[i];
			}
		}
		return min;
	}
	
	public boolean less(Comparable a, Comparable b)
	{
		return a.compareTo(b)<0;
	}
	public static void main(String args[])
	{
		//Array of Integers
		MinElement<Integer> minElementForInt = new MinElement<Integer>();
		Integer[] arrayOfInts = {8,2,5,1,6,10,4};
		System.out.println(minElementForInt.findMin(arrayOfInts));
		
		//Array of Strings
		MinElement<String> minElementForString = new MinElement<String>();
		String[] arrayOfString = {"x", "b", "c","d","a"};
		System.out.println(minElementForString.findMin(arrayOfString));
		
		//Empty Array
		MinElement<Integer> minElementForInt2 = new MinElement<Integer>();
		Integer[] arrayOfInts2 = {};
		System.out.println(minElementForInt2.findMin(arrayOfInts2));
		
	}

}

