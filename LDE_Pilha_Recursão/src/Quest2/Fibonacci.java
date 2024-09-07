package Quest2;

public class Fibonacci {

    public static void main(String[] args) {

        int n=0;
        int total=0;
        
        while(true){

            if(total <= 100){

                break;

            }

            if(n>=1){

                System.out.println(n);
        
            }
        
            else{
        
                total = (n-1) + (n-2);
                System.out.println(total);
                n++;
        
            }

        }

    }

}
