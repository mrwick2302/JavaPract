//Write a program to implement student information in a file and perform the operations on it
import java.io.*;
import java.util.*;
public class student
{

	public static void main(String[] args) throws Exception
	{
		String name,address,std;
		int marks,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name:");
		name=sc.next();
		System.out.println("Enter student address:");
		address=sc.next();
		System.out.println("Enter student class:");
		std=sc.next();
		System.out.println("Enter student  marks:");
		marks=sc.nextInt();
		FileWriter fw = new FileWriter("stud.txt");
		fw.write("Name:"+name+"\n");
		fw.write("Address:"+address+"\n");
		fw.write("Class:"+std+"\n");
		fw.write("Marks:"+marks+"\n");
		fw.close();
		System.out.println("File is created successfully with the content.");
		FileReader fr=new FileReader("stud.txt");
		int ch;
		System.out.println("\nStudent Data:");
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	}
}
