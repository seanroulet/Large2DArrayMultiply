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

        
                // Matrix A (50x5)
                int[][] matrixA = {
                        {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0},
                        {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0},
                        {0,1,0,0,0}, {0,1,0,0,0}, {0,1,0,0,0}, {0,1,0,0,0}, {0,1,0,0,0},
                        {0,1,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0},
                        {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0},
                        {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0},
                        {0,0,1,0,0}, {0,0,1,0,0}, {0,0,1,0,0}, {0,0,0,1,0}, {0,0,0,1,0},
                        {0,0,0,1,0}, {0,0,0,0,1}, {0,0,0,0,1}, {0,0,0,0,1}, {1,0,0,0,0},
                        {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0},
                        {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}, {1,0,0,0,0}
                };

                // Matrix B (5x50)
                int[][] matrixB = {
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
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

