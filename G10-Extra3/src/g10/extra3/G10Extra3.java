
package g10.extra3;


public class G10Extra3 {

    
    public static void main(String[] args) {
        puzzle(10);
        puzzle(100);
    }

    
    private static void puzzle(int n) {
        long a=1;
        long b=1;
        long c=1;
        long d=1;
        long x;
        
        for (int i = 0; i < n; i++)
        {
            x = d + 2 * c + 3 * b + 4 * a;
            a=b;
            b=c;
            c=d;
            d=x;
            
            System.out.println("");
            System.out.println("VUELTA"+i);
            System.out.print("A="+a);
            System.out.print(" B="+b);
            System.out.print(" C="+c);
            System.out.print(" D="+d);
        }
        
        System.out.println("-------- FIN -----------");
        
    }
    
    
}
