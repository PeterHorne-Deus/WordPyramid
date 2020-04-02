/*
 * Peter Horne-Deus
 * This program generates a pyramid of letters from a word entered
 * WordJumble.java
 * April 2, 2020
 */
package wordpyramid;

import javax.swing.*;

/**
 *
 * @author Peter
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //User input varibale
        String input = JOptionPane.showInputDialog("Enter A Word");
        //Calling the method to create the pyramid
        pyramid(input);
        
    }
    
    /**
     * This method removes the first and last characters of a word to output a ppyramid
     * @param word 
     */
    public static void pyramid(String word){
        //Variable
        String shorten;
        
        //Base Case
        if(word.length() == 1 || word.length() == 2){
            System.out.println(word);
        }
        //Making the pyramid
        else{
           shorten = word.substring(1, word.length()-1); 
           System.out.println(word);
           pyramid(shorten);
        }
        
        
        
    }
}
