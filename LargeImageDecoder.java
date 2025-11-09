/**
 * Large Image Decoder Challenge
 * * This file contains large matrices for a new decoding challenge.
 * The resulting image is much larger (50x50)!
 * * TO USE:
 * 1. Complete the 'EmojiDecoder.java' challenge first.
 * 2. Copy your working 'renderImage' function and paste it below.
 * 3. Copy your working 'multiplyMatrices' function and paste it below.
 * 4. Uncomment the code in the 'main' method to run the decoder!
 */
public class LargeImageDecoder {

    public static void main(String[] args) {

        System.out.println("--- Large Image Decoder Challenge ---");
        System.out.println("Rendering a large 50x50 image...");

        
               int[][] matrixA = {
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, // Row 0 (Empty)
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, // Row 1 (Empty)
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, // Row 2 (Empty)
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, // Row 3 (Empty)
            {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, // Row 4
            {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, // Row 5
            {0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0}, // Row 6
            {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0}, // Row 7
            {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0}, // Row 8
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0}, // Row 9
            {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0}, // Row 10
            {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, // Row 11
            {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0}, // Row 12
            {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0}, // Row 13
            {0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0}, // Row 14 (Eye)
            {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0}, // Row 15
            {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0}, // Row 16 (Mouth)
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0}, // Row 17 (Mouth)
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0}, // Row 18
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1}  // Row 19
        };

        // Matrix B (17x20)
        // This matrix is the "palette" of unique rows used to build the image.
        int[][] matrixB = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, // R0 (Empty)
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0}, // R1
            {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0}, // R2
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0}, // R3
            {0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0}, // R4
            {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0}, // R5
            {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0}, // R6
            {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0}, // R7
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0}, // R8
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0}, // R9
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, // R10
            {0,0,0,0,1,1,0,0,1,1,1,1,1,1,0,0,1,1,1,0}, // R11 (Eye)
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}, // R12
            {0,0,0,0,1,1,1,0,1,1,1,1,1,1,1,1,0,0,1,1}, // R13 (Mouth)
            {0,0,0,0,0,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1}, // R14 (Mouth)
            {0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1}, // R15
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,1}  // R16
        };

        /*
        // TODO 1: Uncomment this block after pasting your functions below.

        // Step 1: Multiply the matrices to get the blueprint
        int[][] largeImage = multiplyMatrices(matrixA, matrixB);

        // Step 2: Render the resulting blueprint
        renderImage(largeImage);
        */
            }


    /*
    // TODO 2: Paste your completed renderImage function here
    public static void renderImage(int[][] image) {
        // ... your code ...
    }
    */


    /*
    // TODO 3: Paste your completed multiplyMatrices function here
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        // ... your code ...
        return null; // or your result
    }
    */
        }

