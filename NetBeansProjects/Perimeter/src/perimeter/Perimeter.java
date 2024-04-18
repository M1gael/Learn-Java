package perimeter;
import java.util.* ;
public class Perimeter {

    public static String calcPerSurfVol(double width , Double length , double height){
    double per = (width*2)+ (length*2) ;
    double sur = width*length;
    double vol = width*length*height;
    
    return("The Perimeter is : " + per + "\n The Surface Area is : " + sur + "\n The Volume is : " + vol);
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("What is the width? :");
        double width = kb.nextDouble();
        System.out.println("What is the length? :");
        double length = kb.nextDouble();
        System.out.println("What is the hegiht? :");
        double height = kb.nextDouble();
        
        System.out.println(calcPerSurfVol(width, length, height));
    
                
    }
    
    
}
