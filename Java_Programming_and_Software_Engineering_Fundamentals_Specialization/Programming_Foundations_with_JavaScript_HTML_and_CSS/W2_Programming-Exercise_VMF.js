// Rampup Programming Exercise - Variables, Methods and Functions

// Exercise 1 - - Make a Phrase From Three Words
function phrase3words(value1, value2, value3) {
	var answer = value1 + " " + value2 + " " + value3 ;
	return answer;
}
var result1 = phrase3words("smile","at","everyone");
print(result1);
var result2 = phrase3words("everyone","wave", "back");
print(result2);
var result3 = phrase3words("coding","is", "fun");
print(result3);

// Exercise 2 - Format a name
function reformatName(first, last) {
	return last + ", " + first;
}
var result = reformatName("Susan", "Rodger");
print(result);
result = reformatName("Robert", "Duvall");
print(result);

// Exercise 3 - Number of pixels in an image
function numberPixels(namefile) {
	var someImg = new SimpleImage(namefile);
	var height = someImg.getHeight();
	var width = someImg.getWidth();
	return height * width;
}
var result = numberPixels("chapel.png");
print(result);
result = numberPixels("dinos.png");
print(result);

// Exercise 4 - Perimeter of an image
function perimeter(imageName) {
	var someImg = new SimpleImage(imageName);
	return 2 * (someImg.getHeight() + someImg.getWidth());
}
print(perimeter("rodger.png"));

// Exercise 5 - Print the RGB values of a pixel
function printPixel(nameImage, xpos, ypos) {
	var someImg = new SimpleImage(nameImage);
	print ("red is ", someImg.getRed(xpos,ypos));
	print ("green is ", someImg.getGreen(xpos,ypos));
	print ("blue is ", someImg.getBlue(xpos,ypos));
}
printPixel("drewgreen.png",10, 10);
printPixel("drewgreen.png",250, 500);

// Exercise 6 - Sum of the RGB values for a Pixel
function sumPixel(nameOfImage, xpos, ypos) {
	var someImg = new SimpleImage(nameOfImage);
	return someImg.getRed(xpos,ypos) + someImg.getGreen(xpos,ypos) + someImg.getBlue(xpos,ypos);
}
var answer = sumPixel("drewgreen.png", 250, 500);
print(answer);
answer = sumPixel("drewgreen.png",10, 10);
print(answer);

// NOTE: the names of the images are from https://www.dukelearntoprogram.com programming environment setup for the course.
// If you want to use the code with your own images, replace the image names accordingly
