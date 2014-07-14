/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios24;

/**
 *
 * @author WINDOWS 7
 */
public class ejer11 
{
    //Me falta terminarlo
    public static void main(String[] args) 
    {
        int[] array = {4,4,6,7,2,8,5,3,3};
        int temp, vecesRepetido = 0, numRepetido = -1; 
        
        for (int i=0; i < array.length-1; i++)
        {
            temp = 1;
            for(int j = i+1 ; j< array.length; j++)
            {
                if(array[i] == array[j])
                    temp ++;                
            }
            if(temp > vecesRepetido)
            {
                vecesRepetido = temp;
                numRepetido = array[i];
            }
        }
        System.out.println("El numero que mas se repite es el: " + numRepetido + " con : " + vecesRepetido+" repeticiones"); 
    }
}
