package pkg02;

public class PlusMinus02 {

	public static void main(String[] args) {
		int a = 5, b= 10, c ;        
        c =    ++a     +     ++b ;
 
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        
        a += ++c + 15 ;
        b = 12 ;

        c =    --a     +     --b ;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        
        /* 
		++ a = 5 + 1 = 6
		++ b = 10 + 1 = 11
		c = a + b = 6 + 11 = 17
			
		++c = c = 17 + 1 = 18 
		c + 15 = 18 + 15 = 33
		a = a + c = 6 + 33 = 39
		b = 12
			
		-- a = 39 - 1 = 38
		--b = 12 - 1 = 11 
		c = a + b = 38 + 11 = 49 
         */
        
	}

}
