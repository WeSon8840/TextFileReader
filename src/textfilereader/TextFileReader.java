/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textfilereader;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author glSon8840
 */
public class TextFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String fileName;
        fileName = JOptionPane.showInputDialog("Please enter a file name: ");
        BufferedReader readFile = new BufferedReader(new FileReader("y:/" + fileName));
        String line = "";
        String output = "";
        while((line = readFile.readLine()) != null){ //EOF
            System.out.println(line);
        }
    }
    
}
