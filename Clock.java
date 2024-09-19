public class Clock
{
  public static void main(String[] args)
  {
    timeOfDay(0); // midnight
    timeOfDay(12); // noon
    timeOfDay(7); // morning
    timeOfDay(15); // afternoon
    timeOfDay(21); // evening
    timeOfDay(18); // dusk
  }

  public static void timeOfDay(int time)
  {
    if (time == 0)
    { 
      System.out.println("midnight"); 
    }
    else if (time == 12) 
    {
      System.out.println("noon"); 
    }
    else if (time == 18)
    {
      System.out.println("dusk"); 
    }
    else if (time > 0 && time < 12)
    {
      System.out.println("morning"); 
    }
    else if (time > 12 && time < 18)
    {
      System.out.println("afternoon"); 
    }
    else
    {
      System.out.println("evening"); 
    }
  }
}
