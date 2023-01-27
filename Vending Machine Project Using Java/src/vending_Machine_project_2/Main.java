package vending_Machine_project_2;
/*
import vending_Machine_project_2.TextVendingMachineInterface;
import vending_Machine_project_2.VendingMachineInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        VendingMachineInterface machineInterface = new TextVendingMachineInterface();

        machineInterface.displayProducts();

        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        machineInterface.enterCoins(enteredCoins);

        machineInterface.displayChangeMessage();

    }
}
*/
/*
public class Main { 
	
	static void func(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%5==4)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}
	public static void main(String args[]) {
		
		int arr[] = {19,10,44,3,11,129};
		func(arr);
	}
	}
*/

/*
public class Main { 
	
	public static String func(String s) {
	    String[] arr = s.split("\\.");
	    for (int i = 0; i < arr.length; i++) {
	        if (i % 2 == 1)
	            arr[i]= "abc";
	    }

	    String rString = "";

	    for (int i = 0; i < arr.length - 1; i++) {
	        rString += arr[i];
	        rString += ".";
	    }
	    rString += arr[arr.length - 1];

	    return rString;
	}
	
	public static void main(String args[]) {
		
		String s = "i.like.this.program.very.much";
		System.out.println(func(s));
	
	}
}
	*/


public class Main { 
	
	static boolean areOddVowels(String str)
	{
		str = str.toLowerCase();
		int count =0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
				
				
			}

		}
		if(count%2==0) return false;
		return true;
	}
		
	public static void main(String args[]) {
		
		String str = "Software";
		System.out.println(areOddVowels(str));
	}
	}

