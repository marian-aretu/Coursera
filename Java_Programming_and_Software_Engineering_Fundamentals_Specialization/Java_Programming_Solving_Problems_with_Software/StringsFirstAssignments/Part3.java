
/**
 * Write a description of Part3 here.
 * 
 * @author Marian Aretu 
 * @version 1.0.0
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb){
        // This method returns true if stringa appears at least twice in stringb, 
        // otherwise it returns false. 
        // For example, the call twoOccurrences(“by”, “A story by Abby Long”) 
        // returns true as there are two occurrences of “by”, 
        // the call twoOccurrences(“a”, “banana”) returns true 
        // as there are three occurrences of “a” so “a” occurs at least twice, 
        // and the call twoOccurrences(“atg”, “ctgtatgta”) 
        // returns false as there is only one occurence of “atg”.
        boolean appear = false;
        int firstOcc = stringb.indexOf(stringa);
        if (firstOcc != -1){
            int secondOcc = stringb.indexOf(stringa, firstOcc + stringa.length());
            if (secondOcc != -1){
                appear = true;
            }
        }
    
    
        return appear;
    }
    
    public String lastPart(String stringa, String stringb){
        // This method finds the first occurrence of stringa in stringb, 
        // and returns the part of stringb that follows stringa.  
        // If stringa does not occur in stringb, then return stringb. 
        // For example, the call lastPart(“an”, “banana”) returns the string “ana”, 
        // the part of the string after the first “an”. 
        // The call lastPart(“zoo”, “forest”) returns the string “forest” 
        // since “zoo” does not appear in that word.
        String lastPart = stringb;
        
        int startIndex = stringb.indexOf(stringa);
        if (startIndex != -1){
            lastPart = stringb.substring(startIndex + stringa.length());
        }
        return lastPart;
    
    }
    
    public void testing(){
        // This method should call twoOccurrences on several pairs of strings 
        // and print the strings and the result of calling twoOccurrences (true or false) 
        // for each pair. Be sure to test examples that should result in true 
        // and examples that should result in false.
        boolean twoOcc = twoOccurrences("by", "A story by Abby Long");
        System.out.println("twoOccurences for strings ->by<- in ->A story by Abby Long<- is: " + twoOcc);
        
        twoOcc = twoOccurrences("ken", "entourage");
        System.out.println("twoOccurences for ->ken<- in ->entourage<- is: " + twoOcc);
        
        twoOcc = twoOccurrences("a", "banana");
        System.out.println("twoOccurences for strings ->a<- in ->banana<- is: " + twoOcc);
        
        twoOcc = twoOccurrences("ou", "entourage");
        System.out.println("twoOccurences for strings ->ou<- in ->entourage<- is: " + twoOcc);
        
        
        // Add code to the method testing to call the method lastPart 
        // with several pairs of strings. For each call print the strings passed in 
        // and the result. For example, the output for the two calls above might be:
        // - The part of the string after an in banana is ana.
        // - The part of the string after zoo in forest is forest.
        String lstPrt = lastPart("an", "banana");
        System.out.println("Last part of banana is: " + lstPrt);
        
        lstPrt = lastPart("zoo", "forest");
        System.out.println("Last part of forest is: " + lstPrt);
        
    
    }
}
