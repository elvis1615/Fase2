import java.util.Scanner;
public class adivina {
    
    public static void main(String[] args) {
        int numAleatorio = (int) (Math.random()*100+1);
    	
    	Scanner num=new Scanner(System.in);
    	
    	
    	System.out.println("introdusca el numero");
    	int numero=num.nextInt();
    	
    	
    	
    	while(numero!=numAleatorio){
    		if(numero<numAleatorio){
    			System.out.println("no adivino el numero introdusca un numero mayor");
    			}
    		if(numero>numAleatorio){
    			System.out.println("no adivino el numero introdusca un numero menor");
    			}
    		numero=num.nextInt();	
    		}
    		
    		System.out.println("felicidades adivino el numero es  "+numAleatorio);
    			    			
    			}
    }