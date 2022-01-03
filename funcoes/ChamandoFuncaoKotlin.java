package funcoes;

import kotlin.collections.CollectionsKt;
import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("Joe", "Bob", "Zé");
        System.out.println(SegundoElementoListaKt.secondOrNull(list));
    }
}
