package ki302.Bibun.Lab2;

import static java.lang.System.out;
import java.io.*;


public class HumanApp {
	public static void main(String[] args) throws FileNotFoundException
	{
		
		Human Nazar = new Human();
for (int i = 0; i < 50; i++)
{
	if (i % 2 == 0){
		Nazar.LeftLegStep();
	}
	else {
	Nazar.RightLegStep();
	}
}
		Human Andriy = new Human();
for (int i = 0; i < 20; i++)
{
	if (i % 2 == 0)
	{
		Andriy.RightLegStep();
	}
	else {
		Andriy.LeftLegStep();
	}
}
System.out.println("Nazar Info:");
System.out.println("All Steps:" + Nazar.getAllSteps());
System.out.println("Distance:" + Nazar.getDoneDistance());

System.out.println("\nAndriy Info:");
System.out.println("All Steps:" + Andriy.getAllSteps());
System.out.println("Distance:" + Andriy.getDoneDistance());


	}
}
