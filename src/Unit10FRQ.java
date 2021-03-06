/*
These are my answer for the Unit 10 FRQ.

------------Question 1------------

a.) The gcf method returns the greatest common factor of parameters a and b, as determined by case I and case II. Write
the gcf method below. You are encouraged to implement this method recursively.

b.) Write the reduceFraction method below. Assume that gcf works as specified, regardless of what you wrote in part
(a). You must use gcf appropriately to receive full credit.

--
public class NumberSystem
{
    public static int gcf(int a, int b)
    {
        int result = 0;

        if (a < b)
        {
            result = gcf(b, a);
        }

        else if (b == 0)
        {
            result = a;
        }

        else
        {
            int remainder = a % b;
            result = gcf(b, remainder);
        }

        return result;
    }

    public static void reduceFraction(int numberator, int denominator)
    {
        System.out.println(numerator + "/" + denominator);

        int factor;

        factor = gcf(numerator, denominator);
        numerator = numerator / factor;
        denominator = denominator / factor;

        if (denominator > 1)
        {
            System.out.println(" reduces to " + numerator + "/" + denominator);
        }

        else
        {
            System.out.println(" reduces to " + numerator);
        }
    }

    class Test
    {
        public static void main(String [] args)
        {
            NumberSystem.reduceFraction(30, 3);
            NumberSystem.reduceFraction(8, 20);
            NumberSystem.reduceFraction(24, 9);
            NumberSystem.reduceFraction(7, 3);
        }
    }
}
--
 */