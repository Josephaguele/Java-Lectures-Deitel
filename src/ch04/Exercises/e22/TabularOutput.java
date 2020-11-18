package ch04.Exercises.e22;
/*4.22 (Tabular Output) Write a Java application that uses looping to print the following table of
values:
N 10*N 100*N 1000*N
1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
5 50 500 5000*/
public class TabularOutput {

    public TabularOutput()
    {

    } // end constructor


    public void TabularOutput()
    {
        System.out.println("N\t10*N\t100*N\t1000*N");
        int counter = 1;
        while (counter < 6)
        {
            System.out.println(counter+ " \t" + counter * 10 + " \t\t" + counter *100 + " \t" + counter * 1000);
            counter ++;
        }// end while
    } // end method TabularOutput
} // end class
