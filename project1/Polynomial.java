

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
   A class to represent a polynomial.
*/
public class Polynomial
{
   // An algebraic expression with 2 or more terms
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
   public Polynomial(double coefficient, int power)
   {
      this();
      // TODO: Come back to double check

   }

   /**
    * This is adding terms not polynomials
Adds the polynomial such that the terms are in sorted order from highest power to lowest
      @param p the polynomial to add
      
   */
   public void add(Polynomial p)
   {
      // Iterate through polynomials
      // If there's a matching power create a term object
         // Use the add like terms
      // Else add term to polynomial
      // TODO: your code here
   }

   /**
Multiplies the given polynomial with this one and returns the result
      @param p the polynomial to multiply
      @return this * p
   */
   public Polynomial multiply(Polynomial p)
   {
      // Multiplying 2 polynomials
      // Polynomial 1: 2x^2 + 2
      // Polynomial 2: x + 5
      // Product: 2x^3
      Polynomial result = new Polynomial();
      // Traverse the tree map and multiply the terms
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