/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package za.ac.iie.prog6112.shoeappq1;


public class ShoeAppQ1 {
    
    //1D Array
    //private means we want this array to be accessible in this class only
    //final means we don't want the elements in the array to be changed
    private static final String[] make = {
        "NIKE",
        "ADIDAS",
        "REEBOK"
    };
    //2D array consisting of the quarter rows
    private static final int[][] sales = {
        {100, 150, 70},//Q1
        {88, 92, 103}, //Q2
        {75, 45, 90},  //Q3
        {65, 95, 175}  //Q4
    };

    public static void main(String[] args) {
        //Displaying the heading of the application
       System.out.println("ULTIMATE SHOE SALES");
       
       //Calling another method that will display the table and calculated values.
       populateAndPrintData();
    }
    
    private static void populateAndPrintData() {
        System.out.println(
                "------------------------------------------------------------------------"
        );
        //Next we are displaying the first column heading which is QUARTER
        
        System.out.print("QUARTER\t\t");
        
        //Next, we do a for loop to go through every brand in the "make" array
        for (String brand : make) {
            System.out.print(brand + "\t\t");
        }
        
        //Then we move to the next line
        System.out.println();
        
        System.out.println(
                "------------------------------------------------------------------------"
        );
        
        //Outer Loop
        //This loop will control the rows
        //Remember each row represents one quarter.
        for (int row = 0; row < sales.length; row++) {
           
            //We want the user to see Q1 - Q4 in a vertical manner not horizontal
            
            //row start at 0, we add 1 so that the user sees the quarters (Q1-Q4) in a vertical manner
            System.out.print("Q" + (row + 1) + "\t\t");
            
            //Inner Loop
            //This loop controls the columns
            //each column represents a shoe brand
            
            for (int column = 0;
                    column < make.length;
                    column++
                    ) {
                
                System.out.print(
                        sales[row][column] + "\t\t"
                );
                 
            }
            //After one whole row has been printed we move to the next line
            System.out.println();
        }
        
        System.out.println(
                "------------------------------------------------------------------------"
        );
        
        //Display TOTALS
        System.out.print("TOTAL:\t\t");
        
        for (int column = 0;
                column < make.length;
                column++
                ) {
            System.out.print(
                    calculateTotal(column) + "\t\t"
            );
        }
        System.out.println();
        
        //Display Average
        System.out.print("AVERAGE:\t");
        
        for (int column = 0;
                column < make.length;
                column++
                ) {
            System.out.print(
                    calculateAverage(column) + "\t\t"
            );
        }
        System.out.println();
        
        //Display Minimum Values
        System.out.print("MIN:\t\t");
        
        for (int column = 0;
                column < make.length;
                column++
                ) {
            System.out.print(
                    calculateMin(column) + "\t\t"
            );
        }
        System.out.println();
        
        System.out.print("MAX:\t\t");
        
        for (int column = 0;
                column < make.length;
                column++
                ) {
            System.out.print(
                    calculateMax(column) + "\t\t"
            );
        }
        System.out.println();
        
         System.out.println(
                "------------------------------------------------------------------------"
        );
    }
    
    private static int calculateTotal(int position) {
        //We start the total at 0 because nothing has been added yet
        int total = 0;
        
        //Each value called sale represents one whole row from the sales array
        //We add the value from the selected brand column to the running total.
        
        for (int[] sale : sales) {
            
            
            
            total = total + sale[position];
        }
        
        return total;
    }
    
    private static double calculateAverage(int position) {
        double total = 0;
        
        //First we calculate the total.
        
        for (int[] sale : sales) {
            
            total = total + sale[position];
        }
        
        return total / sales.length;
        
        
        
    }
    
    private static int calculateMin(int position) {
        
        //we will start with the first actual sales value instead of starting at zero.
        
        int min = sales[0][position];
        
        for (int[] sale : sales) {
            
            //if the current value is smaller than the current minimum, replace the minimum
            
            if (sale[position] < min) {
                min = sale[position];
            }
        }
        
        return min;
    }
    
    private static int calculateMax(int position) {
        
        //we will start with the first actual sales value instead of starting at zero.
        
        int max = sales[0][position];
        
        for (int[] sale : sales) {
            
            //if the current value is smaller than the current minimum, replace the minimum
            
            if (sale[position] > max) {
                max = sale[position];
            }
        }
        
        return max;
    
    
}
}