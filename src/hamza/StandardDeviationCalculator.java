package hamza;

import acm.program.ConsoleProgram;

/**
 * File:StandardDeviationCalculator.java
 * --------------------------------------
 * calculates the standard Deviation for
 */
public class StandardDeviationCalculator extends ConsoleProgram {

    /**
     * the main entry method into the program
     * @param args the passed and needed arguments
     */
    public static void main(String[] args) {

        //initialization of the class for acm package
        new StandardDeviationCalculator().start(args);
    }

    /**
     * the main entry point into the acm package
     */
    @Override
    public void run() {
        println("This program calculates the standard deviation of a given double array.");

        double [] theArray=getTheArray();
        double stDev=stDev(theArray);
        println("The standard deviation is: "+stDev);
    }

    /**
     * gets the array from user
     * @return the constructed array
     */
    private double[] getTheArray() {
        int count = readInt("Enter the count of elements element in the array: ");
        double [] theArray= new double[count];

        for (int i = 0; i < count; i++) {
            theArray[i]=readDouble("enter element "+i+": ");
        }

        return theArray;
    }

    /**
     * calculates the standard deviation of a given array
     * @param array the passed array
     * @return the calculated standard deviation
     */
    private double stDev(double [] array){

        //calculating the mean
        double arraySum=0.0;
        for (int i = 0; i < array.length; i++) {
            arraySum+=array [i];
        }
        double mean=arraySum/array.length;

        //adding up the square of differences
        double squareSum=0.0;
        for (int i = 0; i < array.length; i++) {
            double difference=Math.abs(mean-array[i]);
            squareSum+=difference*difference;
        }

        //calculating the standard deviation
        double preStDv = squareSum / array.length;
        double stDev= Math.sqrt(preStDv);
        return stDev;
    }
}
