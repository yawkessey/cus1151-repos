

import java.util.Map;
import java.util.TreeMap;

/**
   A class to represent a polynomial.
*/
public class Polynomial
{
   private Map<Integer, Double> polynomial;

   /**
      Constructs an empty polynomial
   */
   public Polynomial()
   {
      polynomial = new TreeMap<Integer, Double>();
   }

   /**
      Constructs a new polynomial with the given term
      @param t the term to initialize the polynomial with
   */
   public Polynomial(double coefficent, int power)
   {
      this();
     // TODO: your code here
   }

   /**
Adds the polynomial such that the terms are in sorted order from highest power to lowest
      @param p the polynomial to add
      
   */
   public void add(Polynomial p)
   {
      // TODO: your code here
   }

   /**
Multiplies the given polynomial with this one and returns the result
      @param p the polynomial to multiply
      @return this * p
   */
   public Polynomial multiply(Polynomial p)
   {
      Polynomial result = new Polynomial();

      // TODO: your code here: complete this method

      return result;
   }

   /**
Prints the polynomial "nicely" so that it reads from highest term to lowest and doesn't have a leading "+" if the first term is positive.
   */
   public void print()
   {
      boolean firstTerm = true;
      
      // TODO: your code here: complete this method
   }
}