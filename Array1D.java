public class Array1D {

    public static void main(String[] args){
        //declare an Array of integers that can hold 5 integers
        int[] numbers = new int[5];
        int sum =0;
        //initialize the array elements
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        
        //Access and print each array element
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("The element :" + i + " for the array is :" + numbers[i]);
        }
        
        for (int i = 0 ; i < numbers.length ; i++){
            sum += numbers[i];
        }

        System.out.println("The sum of all the array elements are: " + sum);
    }
    
}
