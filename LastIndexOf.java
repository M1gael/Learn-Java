public class LastIndexOf {
    
    public static void main(String[] args){

        String sentence = "i love Pie";

        int position;

        position = sentence.lastIndexOf('i');

        System.out.println("The last index of i , is : " + position);
    }
}

/*    ==Alternatives (Same as indexOf)==

sentence.lastIndexOf('p' , 15) 
sentence.lastIndexOf("pie") 
sentence.lastIndexOf("pie" , 15) 


*/