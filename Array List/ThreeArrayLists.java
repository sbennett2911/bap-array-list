/***********************************************************************
 Program Name: ThreeArrayLists.java
 Programmer's Name: Steven Bennett
 Program Description: Program declares 3 ArrayList objects: priceList,
 quantityList, and amountList.  The value in amount list will be calculated
 by multiplying the corresponding values in the respective indices of the 
 other two lists.
 ***********************************************************************/ 
import java.util.*;
import javax.swing.*;

public class ThreeArrayLists {

	public static void main(String[] args) {
		
		//two arrays to store test values for the array lists.
		double[] PRICE_ARRAY = { 10.62, 14.89, 13.21, 16.55, 18.62, 9.47, 6.58, 18.32, 12.15, 3.98 }; 
		double[] QUANTITY_ARRAY = { 4.0, 8.5, 6.0, 7.35, 9.0, 15.3, 3.0, 5.4, 2.9, 4.8 };
		
		//create 3 ArrayLists
		ArrayList priceList = new ArrayList(10);
		ArrayList quantityList = new ArrayList(10);
		ArrayList amountList = new ArrayList(10);
		
		//load values into priceList
		for (int i = 0; i < 10; i++)
		{
			priceList.add(PRICE_ARRAY[i]);
		}
		
		//load values into quantityList
		for (int i = 0; i < 10; i++)
		{
			quantityList.add(QUANTITY_ARRAY[i]);
		}
		
		//load values into amountList.
		for (int i = 0; i < 10; i++)
		{
			double x = (double) priceList.get(i);
			double y = (double) quantityList.get(i);
			double amount = x * y;
			amountList.add(i, amount);
		}
		
		//create method to display the results.
		for (int i = 0; i < 10; i++)
		{
		System.out.println("1) " + priceList.get(i) + " * " + quantityList.get(i) + " = " + amountList.get(i));
		}
		
		//terminate program.
		System.exit(0);
		
	}
	
}
