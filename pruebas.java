/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalAnalizador;

import jdk.nashorn.internal.runtime.regexp.RegExp;

/**
 *
 * @author eliex
 */
public class pruebas {


    public static void main(String[] args) {
    
String cadena="--HOLSñ 12ed6d7[] !#?\"¡¡¡*--";
String error="q20 - Estado no aceptado";
//int i;
if('-'==cadena.charAt(0)){
    System.out.println("Letra: "+cadena.charAt(0)+ " Estado: q0");
    if('-'==cadena.charAt(1)){
       System.out.println("Letra: "+cadena.charAt(1)+ " Estado: q1");
        if('*'==cadena.charAt(2)){
           System.out.println("Letra: "+cadena.charAt(2)+ " Estado: q2");
           String validac="";
           String c="";
           int b=0;
           for(b=3;b<(cadena.length()-3);b++) { 
            validac=cadena.charAt(b)+"";
        
            c="Letra: "+cadena.charAt(b)+ " Estado: q3";
             if(validac.matches("[A-Za-z]|[ñÑ]|[0-9]|[ ]|[!\"#$%&/()=?¡¿'|@<>-_.,°*+´{}\\[\\];¨:]"))
                        {
                                System.out.println(c);}
             else{ System.out.println(error);
                   System.exit(0);
             }
             
             
                                                 }
        /* if(validac.matches("[A-Z]|[0-9]|[\\t\\n\\x0b\\r\\f]"))
                        {
                                System.out.println(c);*/
                                if(cadena.charAt(cadena.length()-3)=='*'){
                                        System.out.println("Letra: "+cadena.charAt(cadena.length()-3)+ " Estado: q4");
                                       if(cadena.charAt(cadena.length()-2)=='-'){
                                               System.out.println("Letra: "+cadena.charAt(cadena.length()-2)+ " Estado: q5");
                                               if(cadena.charAt(cadena.length()-1)=='-'){
                                                           System.out.println("Letra: "+cadena.charAt(cadena.length()-1)+ " Estado FINAL: q6");
                                                                                      } else{ System.out.println(error);}
                                                                                } else{ System.out.println(error);}                  
                                                                         }else{ System.out.println(error);}
                       /* }else{ System.out.println(error);}*/
             
             
             /*
          String valida="[a-z]?.*|[A-Z]?.*|[0-9]?.*|[\\t\\n\\x0b\\r\\f]?.*|[!]?.*|[\"]?.*|[#]?.*|[$]?.*|[%]?.*|[&]?.*|[/]?.*|[(]?.*|[)]?.*|[=]?.*|[?]?.*|[¡]?.*|[¿]?.*|[']?.*|[|]?.*|[@]?.*|[<]?.*|"
                       + "[>]?.*|[-]?.*|[_]?.*|[.]?.*|[,]?.*|[°]?.*|[*]?.*|[+]?.*|[´]?.*|[{]?.*|[}]?.*|[[]?.*|[]]?.*|[;]?.*|[¨]?.*|[:]?.*";//Espacio=[ \t\n\x0b\r\f]
                     */

             } else{ System.out.println(error);}
        } else{ System.out.println(error); }
}else{ System.out.println(error);}


/*
for(int a=0;a<cadena.length();a++)
{
System.out.println(cadena.charAt(a));
}*/
    
    }
    
    
    
    
    
    
    
    
    
  /*  
    
      private void validar(Object jTextArea1){   
// String cadena="--HOLSñ 12ed6d7[] !#?\"¡¡¡*--";
String cadena=jTextArea1.getText().replace("\n","");
//cadena.replace("\r","");
 System.out.println(cadena);
String error="q20 - Estado no aceptado";
//int i;
if('-'==cadena.charAt(0)){
    System.out.println("Letra: "+cadena.charAt(0)+ " Estado: q0");
    if('-'==cadena.charAt(1)){
       System.out.println("Letra: "+cadena.charAt(1)+ " Estado: q1");
        if('*'==cadena.charAt(2)){
           System.out.println("Letra: "+cadena.charAt(2)+ " Estado: q2");
           String validac="";
           String c="";
           int b=0;
           for(b=3;b<(cadena.length()-3);b++) { 
            validac=cadena.charAt(b)+"";
        
            c="Letra: "+cadena.charAt(b)+ " Estado: q3";
             if(validac.matches("[A-Za-z]|[ñÑ]|[0-9]|[ ]|[!\"#$%&/()=?¡¿'|@<>-_.,°*+´{}\\[\\];¨:]"))
                        {
                                System.out.println(c);}
             else{ System.out.println(error);
                   System.exit(0);
             }
             
                                                 }
        
                                if(cadena.charAt(cadena.length()-3)=='*'){
                                        System.out.println("Letra: "+cadena.charAt(cadena.length()-3)+ " Estado: q4");
                                       if(cadena.charAt(cadena.length()-2)=='-'){
                                               System.out.println("Letra: "+cadena.charAt(cadena.length()-2)+ " Estado: q5");
                                               if(cadena.charAt(cadena.length()-1)=='-'){
                                                           System.out.println("Letra: "+cadena.charAt(cadena.length()-1)+ " Estado FINAL: q6\n");
                                                                                      } else{ System.out.println(error);}
                                                                                } else{ System.out.println(error);}                  
                                                                         }else{ System.out.println(error);}

                                                } else{ System.out.println(error);}
                                           } else{ System.out.println(error); }
                                   }else{ System.out.println(error);}

}

   */ 
}
