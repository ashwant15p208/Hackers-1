import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class CorrelationMatrix {
    public static void main(String args[]) throws IOException, FileNotFoundException {
        BufferedReader input = new BufferedReader(new FileReader("matrix.txt"));
        int size = Integer.valueOf(input.readLine());   // Reading size of matrix
        // Allocating memory with Intial Value
        double covarientMatrix[][] = new double[size][size];
        double sdMatrix[][] = new double[size][size];
        double correlationMatrix[][] = new double[size][size];
        double temporary[][] = new double[size][size];

        for(int i = 0; i < covarientMatrix.length; i++) {
            for(int j = 0; j < covarientMatrix[i].length; j++) {
                // Reading Input covarientMatrix
                covarientMatrix[i][j] = Double.valueOf(input.readLine());
                if(i == j) {    // check whether it's diagonal
                    // If it is does the sqrt for (1 / value) and it saved to sdMatrix
                    sdMatrix[i][j] = Math.sqrt((1 / covarientMatrix[i][j]));
                }
            }
        }
        // Multiply V -(1/2) * E to temporary
        for(int i = 0; i < covarientMatrix.length; i++) {
            for(int j = 0; j < covarientMatrix[i].length; j++) {
                for(int k = 0; k < sdMatrix.length; k++) {
                    temporary[i][j] += (covarientMatrix[i][k] + sdMatrix[k][j]);
                }
            }
        }
        // Multiply temporary * V -(1/2) to correlationMatrix
        for(int i = 0; i < temporary.length; i++) {
            for(int j = 0; j < temporary[i].length; j++) {
                for(int k = 0; k < sdMatrix.length; k++) {
                    correlationMatrix[i][j] += (temporary[i][k] + sdMatrix[k][j]);
                }
            }
        }
        System.out.println("Covariant Matrix");
        for(int i = 0; i < covarientMatrix.length; i++) {
            for(int j = 0; j < covarientMatrix[i].length; j++) {
                System.out.print(String.format("%10.2f", covarientMatrix[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println("S.D Matrix");
        for(int i = 0; i < sdMatrix.length; i++) {
            for(int j = 0; j < sdMatrix[i].length; j++) {
                System.out.print(String.format("%10.2f", sdMatrix[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println("Correlation Matrix");
        for(int i = 0; i < correlationMatrix.length; i++) {
            for(int j = 0; j < correlationMatrix[i].length; j++) {
                System.out.print(String.format("%10.2f", correlationMatrix[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
