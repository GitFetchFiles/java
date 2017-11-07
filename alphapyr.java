import java.util.*;
public class alphapyr
{
	public static void main(String args[])
	{
		int ch=65;  
    	int i,j,k,m;    
    	for(i=1;i<=5;i++)  
    	{  
    	    for(j=5;j>=i;j--)  
    	        System.out.print(" ");  
    	    for(k=1;k<=i;k++)  
    	        System.out.print((char)ch++);  
    	        ch--;  
    	    for(m=1;m<i;m++)  
    	        System.out.print((char)--ch);  
    	    System.out.println("");  
    	    ch=65;  
    	}  
	}
}