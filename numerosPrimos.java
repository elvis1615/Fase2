import java.util.Scanner;
public class numerosPrimos {
    
    public static void main(String[] args) {
    	
    	Scanner num=new Scanner(System.in);
    	System.out.println("introdusca el numero para ver los primos anteriores a el");
    	int numero=num.nextInt();
    	
    	
    	while(numero<=3){
    		System.out.println("introdusca otro numero pues los primeros numeros primos son 2 y 3"); 
    		numero=num.nextInt();	   		
    		}
    		System.out.println("los numeros primos anteriores son \n 2 \n 3");
    	for(int i=2;i<=numero;i++){
    		

    		for(int x=2;x<=i/2&&i%x!=0;x++ ){
    			if(x==i/2){
    				System.out.println(" "+i);
    				}
    			
    			}
    		    		    		
    		}
           			
    			}
    }