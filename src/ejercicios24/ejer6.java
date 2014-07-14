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
public class ejer6 
{
    public static void main(String[] args)
    {
        String a="";
        String palabra=JOptionPane.showInputDialog(null,"Ingrese uns cadena : ");
        String []frase=palabra.split(" ");
        for(int i=frase.length-1;i>=0;i--)
        {
            a=a+frase[i]+" ";            
        }
        JOptionPane.showMessageDialog(null, a);
    }
}
