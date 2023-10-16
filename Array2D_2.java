public class Array2D_2 {
    
    public static void main(String[]args){

        int[][] a = {{15 , 25, 35},{45, 55, 65}};
        int[][] b = {{12 , 22, 32},{42, 52, 62}};
        int[][] sum = new int[2][3];

        for (int i = 0 ; i < a.length ; i ++){
             for (int j = 0 ; j < a[0].length ; j++){

                sum[i][j] = (a[i][j] + b[i][j]);

             }
        }

    
        System.out.println("Sum Of those Two Arrays are: ");
        for (int i = 0 ; i < a.length ; i ++){
             for (int j = 0 ; j < a[0].length ; j++){

                System.out.println("Sum["+i+"]["+j+"] is " + sum[i][j]);
             }
        }


    }
}
