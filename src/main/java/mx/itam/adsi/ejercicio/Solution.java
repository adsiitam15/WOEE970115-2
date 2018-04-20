import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution { //Los corchetes estan mal, pero no me da tiempo de revisarlos
  public static boolean prueba(String cosa) {
    boolean resp = false;
    if(cosa.equals("")) {
      resp=true;
    } else {
      String miCadena=generaCaenaAux(cosa);
      if(cadena.length()%cadenaAux.length()==0){
        int multiplo=cadena.length()/cadenaAux.length();
        String cadenita=cadenaAux;
        for(int i=0;i<n;i++){
          cadenaAux=cadenaAux.concat(cadenita);
        }
        if(cadenaAux.equals(cosa){
           resp=true;
        }
      }
           }
    return resp;
    }
    
    public static String generaCadenaAux(String cadena){ 
      String cadenaAux=cadena.substring(0,cadena.indexOf(cadena.charAt(0),1));
      return cadenaAux;
    }
    
    
    return resp;
  }

    public static void main(String...argv) {
        prueba("");
    }
}


