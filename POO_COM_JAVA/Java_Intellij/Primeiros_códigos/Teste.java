import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    float a, p, imc;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura:");
		a = sc.nextFloat();
		System.out.println("Digite o peso:");
		p = sc.nextFloat();
		
		imc = p/(a*a);
		
		if(imc<=14){
		    System.out.println("Desnutrido!");
		}else if(imc>14 && imc<=25){
		    System.out.println("Normal!");
		}else{
		    System.out.println("Sobrepeso!");
		}
	}
}