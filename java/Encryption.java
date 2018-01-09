package hackerrank;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        in.close();
        
        int len = input.length();    
        double root = Math.sqrt(len);
        int flr = (int) Math.floor(root); 
        int cil = (int) Math.ceil(root);  
        int rows = 0;
        int cols = 0;
        
        if (flr * cil == len) {
            rows = flr;
            cols = cil;
        } else if (flr * cil > len) {
            rows = flr;
            cols = cil;
        } else if (flr * cil < len) {
            if (flr + 1 <= cil) {
                rows = flr + 1;
                cols = cil;
            } 
        }
        
        char[][] array = new char[rows][cols];
        char[] inputchars = input.toCharArray();
        int inputptr = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = inputchars[inputptr];
                inputptr++;
                if (inputptr == len) break;
            }
            if (inputptr == len) break;
        }
        
        StringBuffer buff = new StringBuffer();
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                char ch = array[i][j];
                if (ch != 0) {
                    buff.append(ch);
                }
            }
            if (j != cols - 1) buff.append(' ');
        }
        
        System.out.println(buff);
        
    }
}
