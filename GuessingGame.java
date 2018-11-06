import javax.swing.JOptionPane;					
import java.util.Scanner;								
import java.util.Random;
import java.awt.*;								
import java.applet.*;								
import java.awt.event.*;								
import java.io.*;   //for files						
import java.net.*;
import javax.sound.midi.*;
import java.util.Vector;
//import jmidi.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.String.*;

public class GuessingGame
{
	public static int random;
	public static boolean keepPlaying = true;
	public static int guess;
	public static String answer;
	public static Scanner scan = new Scanner (in);
	public static int x = 1;
	public static int score = 0;
	public static String s;
	public static void main (String args[])
	{
		
		JOptionPane.showMessageDialog(null, "Let's play a guessing game!","Guessing Game", JOptionPane.INFORMATION_MESSAGE);
		while (keepPlaying)
		{
	    if (x >=2)
	    {
	    	out.println();
	    	out.println("*******************************************");
	    }
	    out.println("Round: " + x + "    Score: " + score);
	    out.println();
		out.println("I'm thinking of a number between 1 and 10.");
		out.print("What do you think it is? ");
		guess = scan.nextInt(); 
		random = getRandom();
		results();
		x++;
		}
		
	}
	public static void results ()
	{
		if (guess == random)
		{
			JOptionPane.showMessageDialog(null, "You're right!", "Right Answer", JOptionPane.INFORMATION_MESSAGE);
			score = score + 1000;
		}
		else
		if (guess != random)
		{
			JOptionPane.showMessageDialog(null, "You're wrong! The number was " + random + ".","Wrong Answer",JOptionPane.INFORMATION_MESSAGE);
			playAgain();
		}
	}
	public static int getRandom ()
	{
		return (int)(Math.random() * 10) + 1;
	}
	public static void playAgain()
	{
		s = JOptionPane.showInputDialog(null, "Play again (Y or N)","Play Again", JOptionPane.QUESTION_MESSAGE);
		if (s.equalsIgnoreCase("y"))
		{
			yes();
		}
		else
		if (s.equalsIgnoreCase("n"))
		{
			no();
		}		
	}
	public static boolean yes()
	{
		keepPlaying = true;
		return keepPlaying;
	}
	public static boolean no()
	{
		keepPlaying = false;
		return keepPlaying;
	}
		
}	     	    	  		    					