package latihan;

import java.util.Scanner;

public class latihan2{
    public static void main(String[] args){
        
        int i, j, baris, kolom;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Ordo Matriks");
        System.out.println("======================");
        System.out.print("Masukkan jumlah baris = "); 
        baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom = "); 
        kolom = sc.nextInt();

        int A[][] = new int[baris][kolom];
        int B[][] = new int[baris][kolom];
        int sum[][] = new int[baris][kolom];

        System.out.println("\nMasukkan Matriks A");
        System.out.println("====================");
        for ( i = 0; i < baris; i++ ){
            for ( j = 0; j< kolom; j++ ){
                System.out.println("[" +(i+1)+ "][" +(j+1)+ "]:");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMasukkan Matriks B");
        System.out.println("====================");
        for ( i = 0; i < baris; i++ ){
            for ( j = 0; j< kolom; j++ ){
                System.out.println("[" +(i+1)+ "][" +(j+1)+ "] : ");
                B[i][j] = sc.nextInt();
            }
        }

        //Penjumlahannya
        for ( i = 0; i < baris; i++ ){
            for( j = 0; j < kolom; j++){
                sum[i][j] = A[i][j]+B[i][j];
            }
        }

        System.out.println("/nHasil Penjumlahan Matriks : ");
        System.out.println("==============================");
        for ( i = 0; i < baris; i++ ){
            for ( j = 0; j < kolom; j++ ){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }

    }  

} 