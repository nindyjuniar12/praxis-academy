package Latihan2;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.Show.intShow;
import static fj.Show.arrayShow;
import static fj.function.Integers.even;

public class Array_filter{
    public static void main(String[] args) {
        final Array<Integer> a = array(97, 44, 67, 3, 22, 90, 1, 7, 7, 98, 1078, 6, 68, 40, 32);
        final Array<Integer> b = a.filter(even);
        final Array<Integer> c = a.filter(i -> i % 2 == 0);
        arrayShow(intShow).println(b); //97, 44, 67, 3, 22, 90, 1, 7, 7, 98, 1078, 6, 68, 40, 32
    }
}