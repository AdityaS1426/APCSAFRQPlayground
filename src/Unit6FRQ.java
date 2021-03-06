/*
These are my answers to the Unit 6 FRQ.

------------Question 1------------

Write a code segment that uses an enhanced for loop to print all elements of words that end with "ing". As an example,
if words contains {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"}, then the following
output should be produced by the code segment.
fading

trailing

batting

Write the code segment as described above. The code segment must use an enhanced for loop to earn full credit.
--
class Unit6FRQ
{
    public static void main(String [] args)
    {
        String ing [] = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};

        for (String i: ing)
        {
            if (i.endsWith("ing"))
            {
                System.out.println(i);
            }
        }
    }
}
--

------------Question 2------------

a.) Complete the method computeBonusThreshold below, which is intended to return the bonus threshold based
on the contents of the itemsSold array. Assume that itemsSold has been filled appropriately, and that the array
contains at least three employees.

b.) Write the method computeWages. Assume that itemsSold has been filled appropriately, and there are at least
three employees in the array. Assume also that the wages array and the itemsSold array have the same length. Your
solution must call computeBonusThreshold appropriately to receive full credit.
--
public class Payroll
{
    private int [] itemsSold;

    private double [] wages;

    // Constructor is kept for demonstrating the code output.
    public Payroll()
    {
        itemsSold = new int [] {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
        wages = new double [10];
    }

    public double computeBonusThreshold()
    {
        int highest = itemsSold [0];
        int lowest = itemsSold [0];

        double bonusThreshold = 0;

        for (int i = 1; i < itemsSold.length; i++)
        {
            sumOfItemsSold += itemsSold[i];

            if (itemsSold [i] < lowest)
            {
                lowest = itemsSold[i];
            }

            bonusThreshold = (sumOfItemsSold - lowest - highest) / (itemSold.length - 2.0);
            return bonusThreshold;
        }

        public void computeWages (double fixedWage, double perItemWage)
        {
            double bonusThresholdForWages = computeBonusThreshold();

            for (int i = 0; i < wages.length; i++)
            {
                wages [i] = fixedWage + (itemsSold [i] * perItemWage);

                if (itemSold [i] > bonusThresholdForWages)
                {
                    wages [i] = wages [i] * 1.1;
                }
            }
        }

        public void printWages()
        {
            for (int i = 0; i < wages.length; i++)
            {
                System.out.printlnf("Employee = %d, ItemsSold = %d, Wage = %.2f\n", i, itemsSold [i], wages [i]);
            }
        }
    }
}

============Main============

public class Main
{
    public static void main(String [] args)
    {
        Payroll payroll = new Payroll();

        System.out.println("The bonus threshold items are: " + payroll.computeBonusThreshold());

        payroll.computeWages(10.0, 1.5);

        payroll.printWages();
    }
}
--
 */