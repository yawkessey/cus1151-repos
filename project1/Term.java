

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
      this.coefficient = coefficient;
      this.power = power;
   }

   /**
      @return the coefficient
   */
   public double getCoefficient()
   {
      return this.coefficient;
   }

   /**
      @return the power
   */
   public int getPower()
   {
      return this.power;
   }

   /**
    * Multiplies two coefficient  together and returns the result
    * @param t the other term
    * @return this * t as a term
    * Time Complexity: O(1)
    * Space Complexity: O(1)
   */
   public Term multiply(Term t)
   {
      // TODO: Come back and check if you need to addTerm power
      return new Term((coefficient * t.coefficient), (power + t.power));
   }

   /**
      Adds the term to this term if the powers are the same 
      @param t the term to attempt to addTerm
       * Time Complexity: O(1)
       * Space Complexity: O(1)
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
       * Time Complexity: O(1)
       * Space Complexity: O(1)
   */
   public String toString()
   {
      String result = "";
      if(this.coefficient > 0){
         result += "+ ";
      }
      if (this.power == 0)
      {
         result += Double.toString(this.coefficient);
      } else if (this.power == 1)
      {
         result += this.coefficient + "x";
      } else {
         result += this.coefficient + "x^" + this.power;
      }
      return result;
   }
}