
package g4s21p8dbll;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "1945","Windsor","1914","4 de julio","1492"
    };
    
    String[] radioR = {
        "1945,1900,1934,2000",
        "Gomez,Sanchez,Hernandez,Windsor",
        "1916,1913,1914,1915",
        "6 de marza,4 de julio,4 de junio,24 de diciembre",
        "1500,1492,1842,1675"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
