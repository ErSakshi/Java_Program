/*write a program to display the population for of the next five years.Assume the current population is 312.032,486 and one year has 365 days.

The Indian Census Bureau projects population based on the following assumptions:
 One birth every 7 seconds
 one death every 13 seconds 
*/ 


class Population
{
  public static void main(String []args)
  {
    long currentPopulation=312032486;
    long secondsOneYear=365*24*60*60;
    long birthPerYear=secondsOneYear/7;
    long deathPerYear=secondsOneYear/13;
    long immigrantPerYear=secondsOneYear/45;
    long nextFiveYear=currentPopulation+((birthPerYear-deathPerYear+immigrantPerYear)*5);
   
    System.out.println("Current Population - "+currentPopulation);
    System.out.println("Next Five Year Population - "+nextFiveYear);
  }
}