
/**
   A class to test the Polynomial class.
*/
public class PolynomialTest
{
   public static void main(String[] args)
   {
      Polynomial p = new Polynomial(new Term(-10.0, 0));
      p.addTerm(new Term(-1.0, 1));
      p.addTerm(new Term(9.0, 7));
      p.addTerm(new Term(5.0, 10));

      Polynomial q = p.multiply(p);
      System.out.print("p: ");
      p.print();
      System.out.println();
      System.out.print("q: ");
      q.print();
      System.out.println();
      System.out.println();

     /*
        for above example your output must be:
        100.0 + 20.0x + 1.0x^2 - 180.0x^7 - 18.0x^8 - 100.0x^10 - 10.0x^11 + 81.0x^14
        + 90.0x^17 + 25.0x^20
      */

      // Example below: p = x^2-10X + 1 and q = x^3 + 5x - 20
      // print p and q and print p+q
      Polynomial p1 = new Polynomial(new Term(1, 2));
      p1.addTerm(new Term(-10, 1));
      p1.addTerm(new Term(1, 0));

      Polynomial q1 = new Polynomial(new Term(1, 3));
      q1.addTerm(new Term(5, 1));
      q1.addTerm(new Term(-20, 0));

      System.out.print("p: ");
      p1.print();
      System.out.println();
      System.out.print("q: ");
      q1.print();
      System.out.println();
      System.out.print("p + q: ");
      Polynomial sum = p1.addPolynomial(q1);
      sum.print();


      //print p*q
      Polynomial product = p1.multiply(q1);
      System.out.println();
      System.out.print("p * q: ");
      product.print();

   }
   }

