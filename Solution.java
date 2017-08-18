import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int r = 0; // result
        String[] values = bi.readLine().split(",\\s"); 
        
		for(String s: values){
			int n = Integer.parseInt(s);
			r = r ^ n;
		}
		System.out.println(r);
	}
}
