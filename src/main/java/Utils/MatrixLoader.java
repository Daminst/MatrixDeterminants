package Utils;

import java.io.*;
public class MatrixLoader {

    public MatrixLoader(){
    }

    public static void main(String ... args){
        int[][] a = null;
        try {
            a = new MatrixLoader().getTestShouldBe488Matrix();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] getTestShouldBe488Matrix() throws IOException {
        FileReader in = new FileReader("resultShouldBe488");
        BufferedReader br = new BufferedReader(in);

        int size = Integer.parseInt(br.readLine());
        int[][] matrix = new int[size][];

        String line;
        int iterator = 0;
        while ((line = br.readLine()) != null){
            int[] temp = new int[size];
            int i = 0;
            for(String str : line.split(",")){
                temp[i++] = Integer.parseInt(str);
            }
            matrix[iterator++] = temp;
            //System.out.println(line);
        }

        in.close();

        return matrix;
    }


}
