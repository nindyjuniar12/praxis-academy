package Latihan2;

import fj.data.Array;
import static fj.function.Integers.add;
import static fj.Show.arrayShow;
import static fj.Show.intShow;
import static fj.data.Array.array;

public class Array_map{
    public static void main(String[] args) {
        final Array<Integer> a = array(1, 2, 3);
        final Array<Integer> b = a.map(add.f(42));
        final Array<Integer> c = a.map(i -> i + 42);
        arrayShow(intShow).println(b);
        arrayShow(intShow).println(c);
    }
}