
/**
 * Escreva um programa que receba a idade da pessoa e informa quanto meses e dias ela tem de idade.
 * 
 * Nicoli Siqueira 
 * 11/03/2023
 */
import java.util.Scanner;
public class IDADE_MESES
{
    public static void main (String args[]){
        Scanner t = new Scanner (System.in);
        int idade;
        
        
        System.out.println("Informe a sua idade:");
        idade = t.nextInt();
        
        System.out.println("\fSua idade total é: " + idade + " anos  " + (idade * 12) + " meses e " + (idade * 365)+ " dias ");
        
    }
}
