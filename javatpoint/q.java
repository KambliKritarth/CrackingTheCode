package javatpoint;
class Complex {  
    public double  re, im;           
   
    public Complex(double re, double im) {  
        this.re = re;  
        this.im = im;  
    }  
}  
    
// Driver class to test the Complex level  

public class q{  
    public static void main(String[] args) {  
        Complex c1 = new Complex(10, 15);  
        System.out.println(c1);  
    }  
} 