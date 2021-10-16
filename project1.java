

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import java.util.*;
public class project1
{

	public static void main(String[] args)
	{
		
		System.out.println("----- Welcome To Lockedme.com Project ------------\n"); 
		
		System.out.println("----- Application developed by Pavithra Naveen -------\n");
		
		System.out.println("-----  Developed on October 13 18:18 PM India  -------\n");
		
		System.out.println("-----  Application developed on Core Java Conceppts  -------\n");
		
		String ch1 = "";
		do
		{
		
		System.out.println("Enter below choice from 1 to 4 \n");
		
		System.out.println(" 1. Retrieving files in ascending order \n ");
		System.out.println(" 2. Create new file \n ");
		System.out.println(" 3. Delete a specified file \n ");
		System.out.println(" 4. Search a particular file \n ");
		System.out.println(" 5. Close Application \n ");


		Scanner sc=new Scanner(System.in);
		int a1;
		
		a1=sc.nextInt();
		
		if(a1>=6)
		{
			System.out.println("Please enter valid input from 1 to 5");
		}
		
		
		
		switch(a1)
		{
		
		case 1: 
			
			String folderpath="C:\\Users\\Pavithra Naveen\\OneDrive\\Desktop\\Java programs";
	    	
	    	File folder= new File(folderpath);
	    	
	    	File[] files=folder.listFiles();
	    	
	    	
	    	
	    	for(File file:files)
	    	{
	    		if(file.isFile())
	    		{
	    			System.out.println("File : " + file.getName());
	    			
	    		}
	    		else if(file.isDirectory())
	    		{
	    			System.out.println("directory : " + file.getName());
	    		}
	    		else
	    		{
	    			System.out.println("not known :" + file.getName());
	    		}
	    	}
	    	break;
	    	
		case 2:
			System.out.println("Please enter your new text filename which you want to create");
			Scanner sc1=new Scanner(System.in);
			String fileName=sc1.nextLine();
			
			String path1="C:\\Users\\Pavithra Naveen\\OneDrive\\Desktop\\Java programs";
			 
			File file1=new File(path1,fileName);
			


			try
			{
				if(file1.createNewFile())
				{
					System.out.println("file got created");
				}
			
				else
				{
					System.out.println("file not created");
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			
				}
			break;
			
		case 3:
			
			System.out.println("Please enter filename which you want to delete");
			Scanner sc2=new Scanner(System.in);
			String fileName1=sc2.nextLine();
			
			String path2="C:\\Users\\Pavithra Naveen\\OneDrive\\Desktop\\Java programs";

			
			File file2=new File(path2,fileName1);
			if(file2.delete())
			{
				System.out.println(file2 + " got deleted");
			}
			else
			{
				System.out.println(file2 + " file not found");

			}
		
		
		break;
		
		case 4:
			
			System.out.println("Please enter filename you want to search \n");
			Scanner sc3=new Scanner(System.in);
			String fileName2=sc3.nextLine();
			
			String path3="C:\\Users\\Pavithra Naveen\\OneDrive\\Desktop\\Java programs";

			
			File file3=new File(path3,fileName2);
			if(file3.exists())
			{
				System.out.println(file3 + " search exists file found ");
			}
			else
			{
				System.out.println(file3 + " does not exists file not found");

			}
			break;
			
		case 5:
			System.out.println("Wizard ended ");
			System.exit(0);
		
		}
		System.out.println("Do You want to continue(yes / no)");
		
		ch1=sc.next();
		
		
		}while(ch1.equals("yes"));
		
	
	}

}


	
		

		
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

	
	
	
	
	
	
	
	

