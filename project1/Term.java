

/**
   A class to represent an algebraic term.
*/
public class Term
{
   private double coefficient;
   private int power;

   /**
      A constructor to initialize a single term with a given coefficient and power 
      @param coefficient the coefficient
      @param power the power
   */
   public Term(double coefficient, int power)
   {
      // TODO: your code here
   }

   /**
      @return the coefficient
   */
   public double getCoefficient()
   {
     // TODO: your code here
   }

   /**
      @return the power
   */
   public int getPower()
   {
      // TODO: your code here
   }

   /**
      Multiplies two coefficient  together and returns the result
      @param t the other term
      @return this * t as a term
   */
   public Term multiply(Term t)
   {
      // TODO: your code here
   }

   /**
      Adds the term to this term if the powers are the same 
      @param t the term to attempt to add
   */
   public void addIfSamePower(Term t)
   {
      if (t.power == power)
      {
         coefficient += t.coefficient;
      }
   }

   /**
      Returns a string representation of the term with a ^ representing the exponent
      @return a string representation of a term
   */
   public String toString()
   {
      // TODO: your code here. Hints: beware if power is 0 or 1. For example: 5X^0 = 5 or 5X^1 = 5X
   }
}