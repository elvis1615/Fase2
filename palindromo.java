import java.util.Scanner;
public class palindromo {
    
    public static void main(String[] args) {
    	
	Scanner palabra=new Scanner(System.in);
	
	System.out.println("introdusca la palabra a analizar");
	String palabra2=palabra.next();
	
	String palabra3="";
	
		for(int i=palabra2.length()-1;i>=0;i--){
			palabra3+=palabra2.charAt(i);
			}
    System.out.println(palabra2+"\n"+palabra3);
    
    if(palabra3.equals(palabra2)){
    	System.out.println("la palabra es palindromo");
    	}
    else{
    	System.out.println("la palabra no es palindromo");
    	}
    			}
    }
