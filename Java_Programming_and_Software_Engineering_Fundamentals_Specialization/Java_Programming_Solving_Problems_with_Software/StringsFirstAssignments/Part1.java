
/**
 * Write a description of Part1 here.
 * 
 * @author Marian Aretu 
 * @version 1.0.0
 */

import edu.duke.*;
import java.io.*;

public class Part1 {
    public String findSimpleGene(String dna){
        // start codon is "ATG"
        // stop codon is "TAA"
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if  (startIndex == -1){
            return "No Starting codon => NO GENE FOUND!";
        }
        
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if  (stopIndex == -1){
            return "No Stopping codon => NO GENE FOUND!";
        }
        result = dna.substring(startIndex, stopIndex + 3);
        //System.out.println("Length of genome: " + result.length());
        // If the length of the substring between the “ATG” and “TAA” is a multiple of 3, then return the substring that starts with that “ATG” and ends with that “TAA”.
        if (result.length() % 3 != 0 ){
            return "Anomally in the length of the gene => POSSIBLE MUTATION!";
        }
        
        return result;
    }
    
    public void testSimpleGene(){
        String dna = "AATGCGATAATATGGT";
        System.out.println("DNA strand is: " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene + "\n");
        
        dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene + "\n");
        
        dna = "AATGCGTCGGTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene + "\n");
        
        // No starting codon
        dna = "TGCGTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene + "\n");
        
        dna = "ATGCGTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene + "\n");
        
        // No stopping codon
        dna = "AATGCTTGTGTATATGGT";
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene + "\n");
    }    
}
