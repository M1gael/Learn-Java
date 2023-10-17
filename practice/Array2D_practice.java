package practice;
import java.util.Random;

public class Array2D_practice {

    public static void main(String[] args){
        Random rand = new Random();
        int[][] arRandomInts = new int[4][5];

        //Populate array with random
        for(int i = 0 ; i<arRandomInts.length; i++){
            for(int j = 0 ; j<arRandomInts[0].length; j++){
                arRandomInts[i][j] = rand.nextInt(9999999);
            }
        }

        //Find max value of array
        int x = 0;
        for(int i = 0 ; i<arRandomInts.length; i++){
            for(int j = 0 ; j<arRandomInts[0].length; j++){
                if(x < arRandomInts[i][j]){
                    x = arRandomInts[i][j];
                }
            }
        }


        //Print array and max value
        for(int i = 0 ; i<arRandomInts.length; i++){
            for(int j = 0 ; j<arRandomInts[0].length; j++){
                System.out.println("Array value " + i+";"+j +" is: " + arRandomInts[i][j]);
            }
        }

        System.out.println("Max value of arr is " + x);
    }
    
}
