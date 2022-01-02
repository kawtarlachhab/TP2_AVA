package partie2.exercices;

import java.lang.reflect.Array;

public class TriSimple {
	// Data
	private int[] tab;
	private int nbrElement;
	private int increment;

	// Method
	/*****************************************************************/
	public TriSimple() {
		this.nbrElement = 0;
		this.tab = new int[30];
		this.increment = 2;
	}

	/*****************************************************************
	                         the constructor 
	 *****************************************************************/
	public TriSimple(int taille, int increment) {
		this.nbrElement = 0;
		this.tab = new int[taille];
		this.increment = increment;
		for (int i = 0; i < tab.length; i++)
			tab[i] = -1;
	}

	/*****************************************************************
	                  * TRANSFERT TAB /
	 *****************************************************************/
	public void resize(int newTaille) {
		int[] newTab = new int[newTaille];
		for (int i = 0; i < this.nbrElement; i++)
			newTab[i] = this.tab[i];
		this.tab = newTab;
	}

	/*****************************************************************
	               * insert in the middle /
	 *****************************************************************/
	public void insertion_in_The_middle(int value) {
		int i = 0;
		for (i = 0; i < this.nbrElement; i++) {
			if (this.tab[i] > value)
				break;
		}
		for (int j = this.nbrElement; j > i; j--) {
			this.tab[j] = this.tab[j - 1];
		}
		this.tab[i] = value;
	}

	/*****************************************************************
	              * INSERT /
	 *****************************************************************/
	public void insert(int value) {
		// size too small (number of case empty <2)
		if ((this.tab.length - this.nbrElement) < 2)
			resize(this.tab.length + this.increment);
		// Empty(insertion at the beginning)
		if (this.nbrElement == 0)
			this.tab[nbrElement] = value;
		// (insertion at the end)
		else if (this.tab[this.nbrElement - 1] < value)
			this.tab[this.nbrElement] = value;
		// else, insertion normal (insertion in the middle)
		else {
			insertion_in_The_middle(value);
		}
		// increment number of elements
		this.nbrElement++;
	}
	/*****************************************************************
	                         * DELETE /
	 *****************************************************************/
	public void Delete(int value) {
		int i = 0, flag = 0;
		for (i = 0; i < this.nbrElement; i++) {
			if (this.tab[i] == value) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			for (int j = i; j < this.nbrElement; j++)
				this.tab[j] = this.tab[j + 1];
			this.nbrElement--;
			System.out.println("The element is removed");
		} else
			System.out.println("the element does not exist!");
		if ((this.tab.length - this.nbrElement) == 2 * this.increment)
			resize(this.tab.length - this.increment);
	}

	/*****************************************************************
	               * PRINT /
	 *****************************************************************/
	public String toString() {
		String str = " ";
		for (int i = 0; i < this.nbrElement; i++)
			str += " | " + Integer.toString(this.tab[i]);
		str += " | ";
		return str;
	}

}
