package partie2.exercices;

import java.util.Scanner;

public class Menu_tab {
	public static int Menu()
	{
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		System.out.println("\t\t-------- Menu------- ");
		System.out.println("\t\t- 1.     Inserer un élément");
		System.out.println("\t\t- 2.     Supprimer un élément");
		System.out.println("\t\t- 3.     Afficher");
		System.out.println("\t\t- 4.     Quitter ");
		System.out.println("\t\t-Enter the choice\n ");
		choice=keyboard.nextInt();
		return choice;
	}//end Menu
	public static void main(String[] args) {
		int size=0 ,choice=0, increment=0;
	    Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the size of the table: ");
	    size= keyboard.nextInt();
		System.out.println("Enter the increment: ");
		increment = keyboard.nextInt();
		TriSimple tableau = new TriSimple(size,increment);
		while (true) 
		{
		  switch(Menu())
			{
				 case 1: {System.out.println("enter the value : ");
					      tableau.insert(keyboard.nextInt()); break;}
				 case 2: { System.out.println("enter the value to delete ");
						      tableau.Delete(keyboard.nextInt()); break;}  	   
				 case 3: {System.out.println(tableau); break;}
				 case 4:  return;
				 default: System.out.println("You entered a wrong choice!!");break;
				
		   }//switch
		}//end while
	}// end main
}//End Menu_tab
