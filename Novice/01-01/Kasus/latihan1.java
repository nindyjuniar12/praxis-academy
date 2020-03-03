public class latihan1 {
    public static void main(String[] args){
        int[][] matrix = new int[5][5];
        matrix[0][2]=1;
        matrix[2][0]=2;
        matrix[0][0]=3;
        matrix[0][1]=4;
        matrix[1][0]=5;

        for (int j = 0; j < matrix[0].length; j++)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }

    }
}