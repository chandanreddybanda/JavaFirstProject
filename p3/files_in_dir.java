package p3;
import java.io.*;
public class files_in_dir {
	public static void main(String[] args) {
		File dir = new File("../../rajiv");
	    String[] files = dir.list();
	    if (files == null) {
	       System.out.println( "No files in directory");
	    } else { 
	    	for (int i = 0; i< files.length; i++) {
	    		String name = files[i];
	    		System.out.println(name);
	         }
	      }
	   }
	
}
