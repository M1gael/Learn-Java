public class LastIndexOf {
    
    public static void main(String[] args){

        String sentence = "i love Pie";

        int position;

        position = sentence.lastIndexOf('i');

        System.out.println("The last index of i , is : " + position);
    }
}

/*    ==Alternative 1==
    sentence.indexOf('p' , 15) 
    [The second paramater tells the method where to start.]
 
    
    ==Alternative 2==
    sentence.indexOf("Pie") 
    [Returns the index or position of the first occurrence of the specified text or string.]
 

    ==Alternative 3==
    sentence.indexOf("Pie" , 10) 
    [ Receives two parameters. The first parameter is the part of the string you are looking for and
    the second parameter is the index from where to start looking at]




*/