//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if (Character.equals(s) && ans == 2) {
                ans = 1;
            }
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
     switch (str.toLowerCase()) {
            case "byte":
                return 1;   // Size in bytes
            case "short":
                return 2;
            case "int":
            case "integer":  // Handles both "int" and "Integer"
                return 4;
            case "long":
                return 8;
            case "char":
            case "character":  // Handles both "char" and "Character"
                return 2;
            case "float":
                return 4;
            case "double":
                return 8;
            default:
                // If the data type doesn't match any of the above
                throw new IllegalArgumentException("Invalid data type: " + str);
        }
    
}
}