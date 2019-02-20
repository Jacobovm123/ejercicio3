/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exelejercicio3;

/**
 *
 * @author Jacobo
 */
public class Exelejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
     
         
   
        String[] columnNames = generateExcelColumnNames(1000);
        
        for (String columnName : columnNames)
        {
            System.out.print(columnName + " , ");
        }
    }
    
    public static String[] generateExcelColumnNames(int columnCount)
    {
        String[] columns = new String[columnCount];
          int contador=0;

        int letra = 65;
        
  
 
        int indicador=0;
     
        for (int i=0;i<columnCount;i++)
        {
            if(indicador==0)
                
                
            {
                columns[i]=""+Character.toString((char)letra);
            }
            
            if(indicador!=0)
            {
                columns[i]=columns[contador]+Character.toString((char)letra);
            }
            if(letra == 90)
            {
                letra= 64;
                
                if(indicador==0)
                {
                    indicador++;
                }
                else
                {
                    contador = contador+1;
                }
            }
           letra++;
            
        }
        
        
        return columns;
    }
        
    
}
