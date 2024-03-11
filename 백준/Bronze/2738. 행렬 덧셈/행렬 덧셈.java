import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
        	
        	String[] matrixLenArr = br.readLine().split(" ");
        	
        	int row = Integer.parseInt(matrixLenArr[0]);
        	int column = Integer.parseInt(matrixLenArr[1]);
        	
        	int[][] matrixA = new int[row][column];
        	int[][] matrixB = new int[row][column];
        	
        	readMatrix(br, matrixA, row, column);
        	readMatrix(br, matrixB, row, column);
        	
        	int[][] sumMatrix = addMatrices(matrixA, matrixB, row, column);
        	printMatrix(bw, sumMatrix, row, column);
        	
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void readMatrix(BufferedReader br, int[][] matrix, int row, int column) throws IOException {
        for (int i = 0; i < row; i++) {
            String[] rows = br.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = Integer.parseInt(rows[j]);
            }				
        }
    }
    
    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB, int row, int column) {
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }
    
    private static void printMatrix(BufferedWriter bw, int[][] matrix, int row, int column) throws IOException {
        for (int i = 0; i < row; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < column; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();
    }
    
}
