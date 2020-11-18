package ch04.Exercises.e39;
/*4.39 (World Population Growth) World population has grown considerably over the centuries.
Continued growth could eventually challenge the limits of breathable air, drinkable water, arable
cropland and other limited resources. There’s evidence that growth has been slowing in recent years
and that world population could peak some time this century, then start to decline.
For this exercise, research world population growth issues online. Be sure to investigate various
viewpoints. Get estimates for the current world population and its growth rate (the percentage by
which it’s likely to increase this year). Write a program that calculates world population growth
each year for the next 75 years, using the simplifying assumption that the current growth rate will stay
constant. Print the results in a table. The first column should display the year from year 1 to year
75. The second column should display the anticipated world population at the end of that year.
The third column should display the numerical increase in the world population that would occur
that year. Using your results, determine the year in which the population would be double what it
is today, if this year’s growth rate were to persist.*/
public class WorldPopulation {

    public WorldPopulation(){}

    public void calculation()
    {
        double populationGrowthRate = 1.05;
        // this is the assumed world population as at 2019
        long currentWorldPopulation = 7600000000l;
        int currentYear = 2020;



        // TABULAR OUTPUT HEADERS
        System.out.println("With the current population growth rate at 1.05% if constant," +
                "this is the expected World population for the next 75 years\n\n");
        System.out.print("Year\t\t\t");
        System.out.print("Anticipated World Population\t\t\t");
        System.out.println("Increase");

        while (currentYear <= 2095)
        {
            // this displays the current years in a tabular format
            System.out.print(currentYear+"\t\t\t");
            currentYear++;

            // this displays the current world population in a tabular format and
            // for the future next 74 years.
            currentWorldPopulation = (long) (currentWorldPopulation *1.05);
            System.out.print(currentWorldPopulation +"\t\t\t\t\t\t\t\t");

            // this displays the numerical increase per year in a tabular format.
            long numericalIncrease = (long) (currentWorldPopulation * 1.05);
            numericalIncrease = numericalIncrease - currentWorldPopulation;
            System.out.println(numericalIncrease);




        }

    }
}
