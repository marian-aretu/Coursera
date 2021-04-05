import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // This method  returns an integer that is the number of points in Shape s
        int numPoints = 0;
        for (Point currPt : s.getPoints()) {
            numPoints = numPoints + 1;
        }
        return numPoints;
    }

    public double getAverageLength(Shape s) {
        // This method returns a number of type double that is 
        // the calculated average of all the sides’ lengths in the Shape S
        double length = getPerimeter(s);
        int numPts = getNumPoints(s);
        double avgLen = length / numPts;
        return avgLen;
    }

    public double getLargestSide(Shape s) {
        // This method returns a number of type double that is the longest side in the Shape S
        // Start with largestSide = 0
        double largestSide = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            if (currDist > largestSide){
                // Update largestSide by currDist
                largestSide = currDist;
            }
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        return largestSide;
    }

    public double getLargestX(Shape s) {
        // This method returns a number of type double that is the largest x value over all the points in the Shape s
        // Start with largestX = 0
        double largestX = 0.0;
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find x for currPt 
            double currX = currPt.getX();
            if (currX > largestX){
                // Update largestX by currX
                largestX = currX;
            }
        }
        
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // This method creates a DirectoryResource (so you can select multiple files) and then iterates over these files. 
        // For each File f, it converts the file into a FileResource with the line
        //
        // FileResource fr = new FileResource(f);    
        //
        // Then it creates a Shape from the FileResource and calculates the shapes perimeter. 
        // What else does it need to do? 
        // It needs to return the the largest perimeter over all the shapes in the files you have selected.
        DirectoryResource dr = new DirectoryResource();
        
        double largestPerim = 0.0;
        for (File f : dr.selectedFiles()) {
            // process each file in turn
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double currPerim = getPerimeter(s);
            if (currPerim > largestPerim){
                largestPerim = currPerim;
            }
        }
        return largestPerim;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        
        DirectoryResource dr = new DirectoryResource();
        
        double largestPerim = 0.0;
        for (File f : dr.selectedFiles()) {
            // process each file in turn
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double currPerim = getPerimeter(s);
            if (currPerim > largestPerim){
                temp = f;
            }
        }
        
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int numPts = getNumPoints(s);
        double avgLen = getAverageLength(s);
        double largestSide = getLargestSide(s);
        double largestX = getLargestX(s);
        System.out.println("perimeter = " + length);
        System.out.println("number of points = " + numPts);
        System.out.println("average side length = " + avgLen);
        System.out.println("largest side length = " + largestSide);
        System.out.println("largest X length = " + largestX);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
        double largestPerim = getLargestPerimeterMultipleFiles();
        System.out.println("largest perimeter = " + largestPerim);
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        String fNameLargestPerim = getFileWithLargestPerimeter();
        System.out.println("Filename with largest perimeter = " + fNameLargestPerim);
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        pr.testPerimeterMultipleFiles();
        pr.testFileWithLargestPerimeter();
    }
}
