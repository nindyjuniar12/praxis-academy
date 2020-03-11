package Latihan2;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;

public class Array_forall{
    public static void main(String[] args) {
        final Array<String> a = array("hellow", "There", "what", "day", "is", "it");
        final boolean b = a.forall(s -> fromString(s).forall(isLowerCase));
        System.out.println(b); 
    }
}
