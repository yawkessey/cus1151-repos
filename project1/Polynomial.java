

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
   A class to represent a polynomial.
*/
public class Polynomial
{
   // Stores all the terms' coefficients and powers of a polynomial
   private final Map<Integer, Double> polynomial;

   /**
      Constructs an empty polynomial treemap
   */
   public Polynomial()
   {
      polynomial = new TreeMap<Integer, Double>(Collections.reverseOrder());
   }

   /**
    * Constructs a new polynomial with the given term
    * @param t the term to initialize the polynomial with
   */
   public Polynomial(Term t)
   {
      this();
      polynomial.put(t.getPower(), t.getCoefficient());
   }

   /**
    * Adds a term to a polynomial
    * @param t the term to add to the polynomial.
    * Time Complexity: O(log N)
    * Space Complexity: O(1)
   */
   public void addTerm(Term t)
   {
      // Check polynomial treemap to see if there are terms with the same power
      if (polynomial.containsKey(t.getPower()))
      {
         // Adds the two terms with the same power
         Term oldTerm = new Term(polynomial.get(t.getPower()), t.getPower());
         t.addIfSamePower(oldTerm);
      }
      // Add the term to the treemap. If there is a term with the same key
      // It would be overwritten with the terms that were added together
      polynomial.put(t.getPower(), t.getCoefficient());
   }

   /**
    * Adds the given polynomial with this one and returns the result
    * @param p the polynomial to add
    * @return result of combined polynomials (this + p)
    * Time Complexity: O(N log N)
    * Space Complexity: O(N)
    */
   public Polynomial addPolynomial(Polynomial p){
      // Loop through parameter @param p
      for (Map.Entry<Integer, Double> givenPolynomial : p.polynomial.entrySet()){
         Term addingTerm = new Term(givenPolynomial.getValue(), givenPolynomial.getKey());
         // Use addTerm method to check if the current term is the same power or not
         // Then adds to our existing polynomial
         addTerm(addingTerm);
      }
      return this;
   }

   /**
    * Multiplies the given polynomial with this one and returns the result
    * @param p the polynomial to multiply
    * @return this * p
    * Time Complexity: O(N * M log K)
    * Space Complexity: O(N^2)
   */
   public Polynomial multiply(Polynomial p)
   {
      Polynomial result = new Polynomial();
      // Traverse the tree map and multiplies each term of both polynomials
      for (Map.Entry<Integer, Double> originalPolynomial : polynomial.entrySet()){
         Term originalPolynomialTerm = new Term(originalPolynomial.getValue(), originalPolynomial.getKey());
         for (Map.Entry<Integer, Double> givenPolynomial : p.polynomial.entrySet()){
            Term givenPolynomialTerm = new Term(givenPolynomial.getValue(), givenPolynomial.getKey());
            Term product = originalPolynomialTerm.multiply(givenPolynomialTerm);

            // Checks if there are any terms with the same power before adding the
            // product of the two terms to the result polynomial
            if (result.polynomial.containsKey(product.getPower())){
               result.polynomial.put(product.getPower(), result.polynomial.get(product.getPower())+product.getCoefficient());
            } else {
               result.polynomial.put(product.getPower(), product.getCoefficient());
            }
         }
      }
      return result;
   }

   /**
    * Prints the polynomial "nicely" so that it reads from highest term to
    * lowest and doesn't have a leading "+" if the first term is positive.
    * Time Complexity: O(N)
    * Space Complexity: O(N)
   */
   public void print()
   {
      StringBuilder result = new StringBuilder();
      for (Map.Entry<Integer, Double> entry : polynomial.entrySet()) {
         Term termPolynomial = new Term(entry.getValue(), entry.getKey());
         result.append(termPolynomial.toString()).append(" ");
      }
      if(result.charAt(0)=='+'){
         System.out.print(result.substring(2));
      } else {
         System.out.print(result);
      }
   }
}