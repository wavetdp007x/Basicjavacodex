package Week12;

public class Ex_WhileLoop01 {
    public static void main (String [] args){
        // 1 2 3 4 5 6 7 8 9 10 . . . . . 
        int j = 1;
        while (j <= 10){
            System.out.println(j+" ");
            j += 3;
        }
        
        
    
        for (int  i = 1; i <= 10; i+=2){
            System.out.println(i+" ");
        }
        //System.out.println();
        for(int i  = 10; i >= 1; i--){
            System.out.println(i+" ");
        }
    }
}
