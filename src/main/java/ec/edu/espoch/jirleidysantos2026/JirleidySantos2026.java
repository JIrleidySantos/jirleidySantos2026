/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.jirleidysantos2026;

import java.util.Scanner;

/**
 *
 * @author mundo
 */
public class JirleidySantos2026 {

    public static void main(String[] args) {
        
        float [] notas = new float [5] ;
        float promed;
        float notAlta;
        float notBaja;
        float aprob;
        float reprob;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <5; i++){
    
        System.out.println("ingrese sus notas ");
        notas[i]=sc.nextFloat();
        }    
        System.out.println("--Ingrese unaopcion del 1 al 5 --");
        System.out.println("1. Calcular el Promedio de los productos:" );
        System.out.println("2. Calcular la nota mas alto y mas bajo de los productos:" );
        System.out.println("3. Calcular la nota aprobada y reprobada de los productos:" );
        System.out.println("4. Salir:" );
      
        int menu=sc.nextInt();
        
        switch (menu){
            case 1:
                float suma=0; 
                System.out.println("opcion 1 " );
                for (int i = 0; i <5; i++){
                    suma = notas[i]+suma;
                    System.out.println("Su promedio es: "+suma);
                }        
            break;
            case 2:
                System.out.println("opcion 2 " );
                float base=0;
                for (int i = 0; i < 5; i++) {
                    if (base<notas[i]){
                        base=notas[i];
                    }
                    if (base>notas[i]){
                        base=notas[i];
                    }
            break;
            case 3:
                System.out.println("opcion 3 " );
            break;   
            case 4: 
                System.out.println("opcion 4 " );
            break;
            default:
                throw new AssertionError();
                
                
        }
 
        }


        
                
         
           
    
   }

}
