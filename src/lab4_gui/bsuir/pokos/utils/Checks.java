/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_gui.bsuir.pokos.utils;

/**
 *
 * @author Vladislav
 */
public class Checks {
    
    public static boolean isNumber(String string) {
       
         if (string == null || string.length() == 0) return false;
 
         int i = 0;
         if (string.charAt(0) == '-') {
            if (string.length() == 1) {
               return false;
            }
            i = 1;
         }
 
         char c;
         for (; i < string.length(); i++) {
             c = string.charAt(i);
             if (!(c >= '0' && c <= '9')) {
                 return false;
             }
         }
         return true;
     }
    
}
