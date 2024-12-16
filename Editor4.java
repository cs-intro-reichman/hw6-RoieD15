import java.awt.Color;
/**
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image (and the greyScaled target image), and the number of morphing steps (an int) - n. 
 * The program takes the source image, and morphs it into its grey-scaled version, in n steps.
 */
public class Editor4 {
    public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
    }
}

