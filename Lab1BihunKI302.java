
import java.io.*;
import java.util.*;

/**
* Загальнодоступний клас Lab1BihunKi302 для реалізації лабораторної роботи №1
* @author Тарас
* 
*/


public class Lab1BihunKI302 {

	public static void main(String[] args) {

Scanner in = new Scanner(System.in);

int side;
System.out.println("Введіть розмір квадратної матриці:");
side = in.nextInt();
in.nextLine();

//Ввід символа-заповнювача із перевіркою
String filler;
do
{
	System.out.println("Введіть cимвол-заповнювач:");
	filler = in.nextLine();

	if (filler.length() > 1)
	{
		System.out.println("Символ-заповнювач повинен бути один. ");
	}
	if (filler.length() == 0)
	{
		System.out.println("Символ-заповнювач не введено. ");
	}
}while(filler.length() != 1);

// Створю файл для подальшого запису у нього 
PrintWriter fout = null;
try {
	File fileOut = new File("E:\\Repos\\CPPT_LABS\\LAB_1\\src\\FileOut.txt");
	
	if(!fileOut.exists())
		fileOut.createNewFile();
		fout = new PrintWriter(fileOut);
	
} catch(IOException e) {
	System.out.print("Error: " + e);
}

//Виділення пам'яті  
char[][] arr = new char[side][];
for (int i = 0; i < side; i++)
{
		arr[i] = new char[side-i];
}
//Вивід у консоль та файл "FileOut.txt"
for (int i = 0; i < side; i++)
{
	for (int k = 0; k < i; k++)
	{
		System.out.print("  ");
		fout.print("  ");
	}
	for (int j = 0; j < side-i; j++)
	{ 		
		arr[i][j] = (char) filler.codePointAt(0);
	System.out.print(arr[i][j] + " ");
	fout.print(arr[i][j] +  " ");
	}
	System.out.print("\n");
	fout.print("\n");


}
fout.close();
	}
	
}