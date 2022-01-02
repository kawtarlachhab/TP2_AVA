package partie2.exercices;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_troncature {
	
	public static String trancature(double d, int nbrDecimal) {
		
		String nombre =Double.toString(d),
		whole_part=null, 
	    decimal_part = null, 
	    Decimal=null;
		
		StringTokenizer st = new StringTokenizer(nombre,".");/*La classe StringTokenizer => découper une chaîne de
		                                                       caractères en tokens séparés par des délimiteurs. 
		                                                       Un token => plus grande séquence de  caractères qui 
		                                                       ne sont pas des délimiteurs
		                                                       ou un délimiteur lui-même (en fonction du paramètre returnDelims).*/
		whole_part = st.nextToken();
		//if(st.hasMoreTokens()) //there are two arguments
		decimal_part = st.nextToken();
		Decimal =  decimal_part.substring(0,nbrDecimal); /*La méthode substring() 
		                                            *retourne une sous-chaîne de la chaîne courante, 
		                                            entre un indice de début et un indice de fin.*/
		if(nbrDecimal==0)return whole_part;
		else return  (whole_part+"."+Decimal);
	}
	
   public static void main(String[] values) {	   
	double d;int nbr;
	if(values.length==2)
	{
		
			try {
					d=Double.parseDouble(values[0]);
					nbr=Integer.parseInt(values[1]);	
					if(nbr>=0)
						{
						    trancature(d, nbr);
						    System.out.println("Result: "+	trancature(d,nbr));
						}
					
			} catch (Exception e) {
						// TODO: handle exception
				System.out.println("Warning!! (first argument is a decimal, second argument is an integer)");
			}
	}
	else System.out.println("the number of arguments entered is invalid (enter two arguments)");
}
}
