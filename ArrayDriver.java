package ki_302.Bihun.Lab6;

import java.util.*;
import java.io.*;

public class ArrayDriver {
	
	public static void main(String[] args) 
	 {
			Array <? super Data> array = new Array <Data>();
			array.AddData(new Male("Vasyl", 1, 8));
			array.AddData(new Female("Victory" , 3));
			array.AddData(new Female("Sara" , 2));
			array.AddData(new Male("Denis" , 2, 10));
			
			Data res = array.findMax();
			System.out.print("The person who greatest missing lessons is: \n");
			res.print();
	}
}
class Array <T extends Data>
{
	private ArrayList<T> arr;
	
	public Array()
	{
		arr = new ArrayList<T>();
	}
	public T findMax()
	{
		if (!arr.isEmpty())
		{
			T max = arr.get(0);
			for (int i=1; i< arr.size(); i++)
			{
				if ( arr.get(i).compareTo(max) > 0 )
				max = arr.get(i);
			}
			return max;
		}
		return null;
	}
	
	public void AddData(T data)
	{
		arr.add(data);
		System.out.print("Person added: ");
		data.print();
	}
	public void DeleteData(int i)
	{
		arr.remove(i);
	}
}

interface Data extends Comparable<Data>
{
	public int getCount();
	public void print();
}

class Male implements Data
{
	private String maleName;
	private int times_Visit_MillitaryTraining;
	private int countMissingLessons;
	
	public Male(String pName, int pTimes_Visit_MillitaryTraining, int pSize)
	{
		maleName = pName;
		times_Visit_MillitaryTraining = pTimes_Visit_MillitaryTraining;
		countMissingLessons = pSize;
	}
	public String getMaleName()
	{
		return maleName;
	}
	public void setMaleName(String name)
	{
		maleName = name;
	}
	public int getTimes_Visit_MillitaryTraining()
	{
		return times_Visit_MillitaryTraining;
	}
	public void setTimes_Visit_MillitaryTraining(int n)
	{
		times_Visit_MillitaryTraining = n;
	}
	public int getCount()
	{
		return countMissingLessons;
	}
	public int compareTo(Data p)
	{
		Integer s = countMissingLessons;
		return s.compareTo(p.getCount());
	}
	public void print()
	{
	System.out.print("Name: " + maleName + ", Times visiting military lessons: " + times_Visit_MillitaryTraining + 
	", Missing the  Lessons: " + countMissingLessons + ";\n");
	}
}

class Female implements Data
{
	private String femaleName;
	private int countMissingLessons;
	
	public Female(String pName, int pMissingLesson) 
	{
		femaleName = pName;
		countMissingLessons = pMissingLesson;
	}
	public String getFemaleName()
	{
		return femaleName;
	}
	
	public void getFemaleName(String name)
	{
		femaleName = name;
	}
	
	public void SetCountMissingLessons(int n)
	{
		countMissingLessons = n;
	}
	
	public int getCount()
	{
		return countMissingLessons;
	}
	
	public int compareTo(Data p)
	{
		Integer s = countMissingLessons;
		return s.compareTo(p.getCount());
	}
	
	public void print()
	{
	System.out.print("Name: " + femaleName + ", Missing lessons: " + countMissingLessons + ";\n");
	 }
}