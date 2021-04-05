
/**
 * Write a description of Part4 here.
 * 
 * @author Marian Aretu 
 * @version 1.0.0
 */

import edu.duke.*;
import java.io.*;

public class Part4 {
    public void findLinks() {
        
        URLResource webPage = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html"); 
	for ( String word : webPage.words() ) {
		    
	    String wordLow = word.toLowerCase();
		    
	    if ( wordLow.contains( "youtube.com" ) && ( wordLow.contains( "https://" ) || wordLow.contains( "http://" ) ) ) {
			    
	        int startQuote = wordLow.indexOf("\"");
		int endQuote = wordLow.lastIndexOf("\"");
		String ytLink = word.substring( startQuote+1, endQuote );
		System.out.println( ytLink );       
            }			
	}
        
    }
    
}
