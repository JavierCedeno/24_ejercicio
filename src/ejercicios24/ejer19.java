/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios24;

import java.util.Scanner;

/**
 *6
 * 
 * @author WINDOWS 7
 */
public class ejer19 
{
    public static void main(String[] args) 
    {
        int decimal, aux,cont=0;
        int binario = 0  ;
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese un numero entero >= 0: ");
        decimal = numero.nextInt();
        aux = decimal;
        while(aux>0)
        {
            binario=aux%2+binario;
            aux/=2;
        }   
        System.out.println("En el numero: "+decimal+ " Convertido a binario existen: "+binario+" Unos");
        System.out.println("");
    }
}
