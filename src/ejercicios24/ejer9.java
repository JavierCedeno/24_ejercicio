/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios24;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 7
 */
public class ejer9 
{
    public static void main(String[] args) 
    {
        int numero=0,c=0;
        for (int i = 0; i < 2; i++) 
        {
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo"));
            if (numero>0)
            {
                i=2;
            }
            else
            {
                i=0;
                JOptionPane.showMessageDialog(null, "Debe de Ingresar Valores Enteros Positivos es Decir Numeros Mayores a 0" );
            }  
        }        
        long[] arreglo = new long[numero];
        for (int i = 0; i < arreglo.length; i++) 
        {
            arreglo[i]=i*i;           
        }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (numero==arreglo[i])
            {
                i=arreglo.length;
                c=1;
            }
        }
        if (c==1 || numero==1)
        {
            JOptionPane.showMessageDialog(null, "TRUE" );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "FALSE" );
        }        
    }
}
