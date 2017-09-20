import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s;
        int i,j;
        String []query;
        int count[];
        //read's the first line 
        s= br.readLine();
        int n = Integer.parseInt(s);
        //read's the n string
        String []text = new String[n];
        for(i=0;i<n;i++){
       	text[i]= br.readLine();
       //System.out.println(text[i]);
    }//end of text 
    	s=br.readLine();
    	//Query text
    	int p = Integer.parseInt(s);
    	query = new String[p];
    	count = new int[p];
    	for(i=0;i<p;i++){
    		query[i]=br.readLine();
    		//System.out.println(query[i]);
    	}//end of query text
//Solution
    	for(i=0;i<p;i++){
    		for(j=0;j<n;j++){
    			//Digit check
    				if(query[i].isDigit()){
    					if(Integer.parseInt(query[i])==Integer.parseInt(text[i]))
    						count[i]=count[i]+1;
    				}
    			else 
    			//String check
    				if(query[i].length()==text[j].length()){
    			for(int k=0;k<query[i].length();k++){
    				if(query[i].charAt(k)==text[j].charAt(k)){
    					count[i]=count[i]+1;
    				}
    				if(count[i]==query[i].length()){
    					count[i]=0;
    					count[i]=count[i]+1;
    				}//compares the value of strings
    			}//checks the two strings 
    			}//check query and string have same length 
    		}//end text loop
    	}//end of main query loop
    for(i=0;i<p;i++)
    	System.out.println(count[i]);
    }
}