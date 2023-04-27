package com.app.tester;
import com.app.fruits.*;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice; int count=0; int index;
		System.out.println("Enter the size of the basket : ");
		Fruit [] basket = new Fruit[sc.nextInt()];
		
		System.out.println("1:add mango,2:add orange,3:add apple 4:display basket "
				+ "5.display name of fruit  6.display all details 7.mark stale  "
				+ "8.mark sour fruits as stale /n  9.");
		do {
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			
			case 1: if (count<basket.length)
			{
				System.out.println("Enter the details : ");
			Mango m1=new Mango(sc.next(),sc.next(),sc.nextDouble());
			 basket[count]= m1;
				count++;	
			}else
			{
				System.out.println("array is full");
			}
			
			break;
			
			
		case 2: if(count<basket.length)
			{
				System.out.println("Enter the details : ");
				Orange o1=new Orange(sc.next(),sc.next(),sc.nextDouble());
				basket[count]= o1;
			
				count++;	
			}else
			{
				System.out.println("array is full");
			}
			
			break;
			
			case 3:
				if(count<basket.length)
				{
					System.out.println("Enter the details : ");
					Apple a1=new Apple(sc.next(),sc.next(),sc.nextDouble());
					basket[count]= a1;
	
					count++;	
				}else
				{
					System.out.println("array is full");
				}
				break;
				
			case 4 :
				for(Fruit f : basket)
				{
					System.out.println(f);
				}
				break;
				
			case 5:
				for(Fruit f : basket)
				{
				System.out.println("The name of the fruit : "+f.getName());
				}
				break;
				
			case 6:
				for(Fruit f : basket)
				{
					if(f.isFresh()==true)
					{
				System.out.println("The name of the fruit : "+f.toString());
				System.out.println(f.taste());
					}		
					
				else {
						System.out.println("Fruit is not fresh");
					}
				
				
				}
				break;
				
			case 7:
				System.out.println("enter the index");
			     index=sc.nextInt();
			     
			     if(index<basket.length)
			     {
			    	 basket[index].setFresh(false);
			    	 
			     }
			     else
			     {
			    	 System.out.println("invalid index");
			     }
			     break;
			     
			case 8:
				for(Fruit f : basket)
				{
					if(f.taste().equals("sour"))
					{
						f.setFresh(false);
					}
				}
				
				break;
			case 9:
				System.out.println("enter index");
				int i=sc.nextInt();
				if(i<basket.length)
				{
						
				if(basket[i] instanceof Mango)
					{
						((Mango)basket[i]).pulp();
						
					}
				else if	(basket[i] instanceof Apple)
				{
					((Apple)basket[i]).jam();
				}
				else
				{
					((Orange)basket[i]).juice();
				}
				
				break;
				
				
		}
	default:
					
				System.out.println("Invalid choice");
				break;
			}
	}while(choice<10);

}
}
