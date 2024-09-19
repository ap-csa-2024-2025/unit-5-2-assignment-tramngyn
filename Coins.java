public class Coins
{
  public static void main(String[] args)
  {
   coinConverter(1234); 
   System.out.println();
   coinConverter(567);
  }

  public static void coinConverter(int pennies)
  {
    int dollars = pennies/100; // calculate dollars
    pennies = pennies % 100;

    int quarters = pennies/25; // calculate quarters
    pennies = pennies % 25;

    int dimes = pennies/10;  // calculate dimes
    pennies = pennies % 10;

    int nickels = pennies/5;  // calculate nickels
    pennies = pennies % 5;

    int leftover = pennies;   // remaining pennies

    // Prints the results
    System.out.println("Dollar bills: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + leftover);
  }

}
