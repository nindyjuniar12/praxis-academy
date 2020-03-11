package Latihan2;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;


public class Array_exists{
    public static void main(String[] args) {
        final Array<String> a = array("Hello", "There", "what", "DAY", "iS", "iT");
        final boolean b = a.exists(s -> fromString(s).forall(isLowerCase));
        System.out.println(b);
    }
}