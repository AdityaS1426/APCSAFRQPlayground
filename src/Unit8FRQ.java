/*
These are my answers to the Unit 8 FRQ.

------------Question 1------------

a.) Write the getHighestYield method, which returns the Plot object with the highest yield among the plots in
farmPlots with the crop type specified by the parameter c. If more than one plot has the highest yield, any of these
plots may be returned. If no plot exists containing the specified type of crop, the method returns null.
Write the getHighestYield method below.
--
class Plot
{
    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield)
    {
        cropType = crop;
        cropYield = yield;
    }

    public String getCropType()
    {
        return cropTyep;
    }

    public int getCropYield()
    {
        return cropYield;
    }
}

class ExperimentalFarm
{
    private Plot[][] farmPlot;

    public ExperimentalFarm(Plot[][] p)
    {
        farmPlots = p;
    }

    public Plot getHighestYield(String c)
    {
        Plot HighestYieldPlot = null;

        for (int Row = 0; Row < farmPlots(0).length; ++Row)
        {
            for (int Column = 0; Column < farmPlots[0].length; ++Column)
            {
                Plot CurrentPlot = farmPlots[Row][Column];

                if (CurrentPlot.getCropType().equals(c) && (HighestYieldPlot != null ? CurrentPlot.getCropYield() > HighestYieldPlot.getCropYield() : true))
                {
                    HighestYieldPlot = CurrentYieldPlot;
                }
            }
        }
        return HighestYieldPlot;
    }
--

b.) Write the sameCrop method, which returns true if all the plots in a given column of farmPlots grow the same
crop and returns false otherwise.
Write the sameCrop method below.
--
    public boolean sameCrop(int col)
    {
        String CropType = farmPlots[0][col].getCropType();

        for (int Row = 1; Row < farmPlots.length; ++Row)
        {
            if (!farmPlots[Row][col].getCropType().equals(CropType))
            {
                return false;
            }
        }

        return true;
    }
}

public class FRQ
{
    public static void main(String [] args)
    {
        Plot[][] TestPlot = new Plot[][]
        {
            {new Plot(crop "corn", yield 20), new Plot(crop "corn", yield 30), new Plot(crop "peas", yield 10)};
            {new Plot(crop "peas", yield 30), new Plot(crop "corn", yield 40), new Plot(crop "corn", yield 62)};
            {new Plot(crop "wheat", yield 10), new Plot(crop "corn", yield 50), new Plot(crop "rice", yield 30)};
            {new Plot(crop "corn", yield 55), new Plot(crop "corn", yield 30), new Plot(crop "peas", yield 30)};
        };

        ExperimentalFarm TestFarm = new ExperimentalFarm(TestPlot);

        System.out.println(TestFarm.getHighestYield(c: "corn").equals(TestPlot[1][2]));
        System.out.println(TestFarm.getHighestYield(c: "peas").equals(TestPlot[1][0]));
        System.out.println(TestFarm.getHighestYield(c: "bananas") == null);
    }
}
--
 */