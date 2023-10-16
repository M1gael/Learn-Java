import javax.xml.crypto.Data;

public class Array2D_1 {
    
    
    
    //Data_Type[][] Array_Name = new int[Row_Size][Column_Size];
    //double [][] empAges = new double[5][3];
    /*
    Data_type:
        It decides the type of elements it will accept. For example, if we want to store integer
        values, then the Data Type will be declared as int. If we want to store Float values, then the Data
        Type will be float.
    
    Array_Name:
        This is the name to give it to this Java two-dimensional array. For example, students,
        age, marks, department, employees, etc.
    */

    /*
    int [][] anIntegerArray; // declaring an two dimensional array of Integers
    short[][] anShortArray; // declaring an two dimensional array of Shorts
    long[][] anLongArray; // declaring an two dimensional array of Longs
    double[][] anDoubleArray; // declaring an two dimensional array of Doubles
    boolean[][] anBooleanArray; // declaring an two dimensional array of Booleans
    char[][] anCharArray; // declaring an two dimensional array of Chars
    String[][] anStringArray; // declaring an two dimensional array of Strings
    */
    public static void main (String[] args){
        
        //declare
        int[][] studMarks = new int[2][3];

        //initialise
        studMarks [0][0] = 15; // Initializing Array elements at position [0][0]
        studMarks [1][1] = 45; // Initializing Array elements at position [1][1]
        studMarks [2][1] = 65; // Initializing Array elements at position [2][1]
        
        //Can also : int[][] empAges = { {10, 20, 30}, {15, 25, 35}, {22, 44, 66}, {33, 55, 77} };
        for (int i = 0; i < studMarks.length; i++) {
            for (int j = 0; j < studMarks[i].length; j++) {
                System.out.println("studMarks[" + i + "][" + j + "] = " + studMarks[i][j]);
            }
        } 
    }
}
