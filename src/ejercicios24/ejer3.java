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
public class ejer3 
{
    public static void main(String[] args) 
    {        
        int x,y,r;
        double proceso,c=1,c1=1;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        double a=(double)x;
        if (x<=0 || x>255)
        {
            r=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+r);
        }
        else
        {
            double[] arreglo=new double[y];
            arreglo[0]=a;              
            for (int i = 1;i<arreglo.length; i++) 
            {                
                c=c+1;
               proceso=x*(1/c);
               arreglo[i]=proceso;           
            }
            for (int i = 0; i < arreglo.length; i++) 
            { 
              if(i==(y-1))
                {                    
                    JOptionPane.showMessageDialog(null,"Resultado "+arreglo[i]);
                }  
            }
        }
    }
}
