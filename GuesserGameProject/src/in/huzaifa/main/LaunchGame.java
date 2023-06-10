package in.huzaifa.main;

import java.util.Scanner;
import java.util.Random;

class Guesser 
{
	int num;
	int nums[]= {0,1,2,3,4,5,6,7,8,9};
	
	int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Guesser guess the number");
		
		try 
		{
		Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted The Guesser");
		}
		
		int num=random.nextInt(10);
		
		System.out.println(num);
		for(int n:nums)
		{
		if(num==n)	
			 num=n;
		else
			continue;
		}
		if(num>9) 
		{
			System.out.println("Number is Not in range!");
			System.out.println("Guess The Number Again!");
			System.out.println();
			num=guessNumber();
		}
		
		return num;
		
	}
}

class Umpire
{
	int noFromGuesser;
	int noFromPlayer;
	
	Player player = new Player();
	
	String username1="Huzaifa@123";
	String password1="hussain786";
	
	String username2="Ammar@123";
	String password2="Ali786";
	
	String username3="Atika@987";
	String password3="ifreen123";
	
	
	
	void getNoFromGuesser()
	{
		Guesser guesser = new Guesser();
		noFromGuesser=guesser.guessNumber();
	}
	
	void getNoFromPlayer() 
	{
		
		noFromPlayer=player.guessNumber();
	}
	
	void compare() 
	{
		if(noFromGuesser==noFromPlayer)
		{
			System.out.println(player.name + " Won The Game!");
		}
		else
		{
			System.out.println(player.name + " Lost The Game!");
		}
	}
	
	void validate()
	{
		String username;
		String password;
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Please Enter the username");
		username=scan.nextLine();
		
		System.out.println("Please Enter the password");
		password=scan.nextLine();
		
		if(username.equalsIgnoreCase(username1) && password.equals(password1) )
		{
			player.name=username.substring(0, 7);
			System.out.println();
			System.out.println("WELCOME");
			System.out.println("=======");
			
		}
		else if(username.equalsIgnoreCase(username2) && password.equals(password2) )
		{
			player.name=username.substring(0, 5);
			System.out.println();
			System.out.println("WELCOME");
			System.out.println("=======");
			
		}
		else if(username.equalsIgnoreCase(username3) && password.equals(password3) )
		{
			player.name=username.substring(0, 5);
			System.out.println();
			System.out.println("WELCOME");
			System.out.println("=======");
			
		}
		else
		{
			System.out.println("Invalid Details");
			System.out.println("Please Try again!");
			validate();
		}
	}
}

class Player
{
	int num;
	String name;
	
	int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println(name + " guess the number");
		int num=scan.nextInt();
		return num;
	}
}

public class LaunchGame 
{
	public static void main(String[] args) 
	{
		Umpire umpire = new Umpire();
		
		System.out.println("WELCOME TO GUESSER GAME!");
		System.out.println("========================");
		
		umpire.validate();
		umpire.getNoFromGuesser();
		umpire.getNoFromPlayer();
		umpire.compare();
		
		System.out.println("Ending");
	}

}
