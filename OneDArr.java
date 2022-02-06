//Try out 

import java.util.Scanner;
public class OneDArr {
public static void main(String[] args) 
{
// Create an object of Scanner class to take input from the keyboard.
    Scanner sc = new Scanner(System.in);	
   
// Ask in how many subjects have you given exams.
    System.out.println("In how many subject have you given exams?");
    int n = sc.nextInt();
   
// Create one-dimensional array with size n.
    int[ ] marks = new int[n];
   
    System.out.println("Enter your marks obtained in subjects:"); 
// Store elements into the array using for loop.
   for(int i = 0; i < n; i++) {
	marks[i] = sc.nextInt();
   }
// Find the total marks obtained in subjects.
   int total = 0;
   for(int i = 0; i < n; i++) {
	 total += marks[i]; // Or, total = total + marks[i]. 
   }
// Display the total marks on the console.
     System.out.println("Total marks: " +total);
// Find the percentage.
     float percentage = (float)total/n; // Casting.
     System.out.println("Percentage: " +percentage+ "%");
 }
}