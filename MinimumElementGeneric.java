# AlgorithmsPart1
Practising the Algorithms Part 1 by Dr. Rob Sedgewick

//Follow Up: Can you return second and nth lowest number in a number? 
	//Given an array, and n, return nth lowest number?
//Follow Up 2: What if the array is infinite stream of numbers?
//Follow Up: What if the array is so big that it does not fit in memory, how will you ready it?
//Edge Case: [1,a,2,c] => Ask the interviewer what is expected?
//What is the complexity of this solution?
// Why would you use comparable when you know type of array is Integer? Check with interviewer,
	//do we know what is the type of data?
	

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
		
		min = arrayofItems[0];
		
		for(int i=0; i < arrayofItems.length; i++)
		{
			if(less(arrayofItems[i],min)) 
			{
				 min = arrayofItems[i];
			}
		}
		return min;
	}
	
	public boolean less(Comparable item1, Comparable item2)
	{
		return item1.compareTo(item2) < 0;
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

