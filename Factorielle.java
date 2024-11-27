class Factorielle
{	
	public static void main (String[] args)
	{
	int i, nbEntiers=0, factorielle=1;
	int ancien;
	nbEntiers= Integer.parseInt(args[0]);
	for (i=2;i<= nbEntiers;i++)
	{
		ancien=factorielle;
		factorielle *= i;
	}
	System.out.println(" Voila la factorielle des "+ nbEntiers +
	" premiers entiers : "+ factorielle );
	}
}
// C:\Users\pc\Desktop\semaine hedy\TP\POO\TP9>java Factorielle
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        // at Factorielle.main(Factorielle.java:7)

// C:\Users\pc\Desktop\semaine hedy\TP\POO\TP9>java Factorielle 3.5
// Exception in thread "main" java.lang.NumberFormatException: For input string: "3.5"
        // at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        // at java.base/java.lang.Integer.parseInt(Integer.java:588)
        // at java.base/java.lang.Integer.parseInt(Integer.java:685)
        // at Factorielle.main(Factorielle.java:7)
		
// C:\Users\pc\Desktop\semaine hedy\TP\POO\TP9>java Factorielle -5
 // Voila la factorielle des -5 premiers entiers : 1