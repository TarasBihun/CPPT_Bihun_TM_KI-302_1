package ki_302.Bihun.Lab4;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
* @author Taras
* @version 1.0
*/
public class EquationsApp {
/**
* @param args
*/
	public static void main(String[] args) 
	{
		try
		{
			out.print("Enter file name: ");
			Scanner in = new Scanner(System.in);
			String fName = in.nextLine();
			PrintWriter fout = new PrintWriter(new File(fName));
			try
			{
				try
				{
					Equations eq = new Equations();
					out.print("Enter X: ");
					fout.print(eq.calculate(in.nextInt()));
					
				}
				finally
				{
					// Цей блок виконається за будь-яких обставин
					fout.flush();
					fout.close();
					
				}
			}
			catch (CalcException ex)
			{
				// Блок перехоплює помилки обчислень виразу
				out.print(ex.getMessage());
			}
		}
		catch (FileNotFoundException ex)
		{
			// Блок перехоплює помилки роботи з файлом навіть якщо вони
			// виникли у блоці finally
			out.print("Exception reason: Perhaps wrong file path");
		}
	}
}

/**
* Class <code>CalcException</code> more precises ArithmeticException
* @author Taras
* @version 1.0
*/
class CalcException extends ArithmeticException
{
	public CalcException(){}
	public CalcException(String cause)
	{
		super(cause);
	}
}

/**
* Class <code>Equations</code> implements method for tg(x) expression
* calculation
* @author Taras
* @version 1.0
*/
class Equations
{
/**
* Method calculates the tg(x) expression
* @param <code>x</code> Angle in degrees
* @throws CalcException
*/
	public double calculate(double x) throws CalcException
	{
		double y, rad,n;
		rad = x * Math.PI / 180.0;
	    n = (x - 90)/180;
		try
		{
			y = (Math.tan(rad));
			//Умова виконання функції tg(x): X != π/2 + πn, n є Z
			if (n % 1 == 0)
			{
				throw new ArithmeticException();
			}
		}
		catch (ArithmeticException ex)
		{
				throw new CalcException("Exception reason: Illegal value of X for tangent calculation (Condition: X "
						+ "!= π/2 + πn, n є Z)");
		}
		return y;
	}
}