package local.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic<Type, U> {
    //solo objetos
    Type foo; //variable de tipo
    U[] baz;


    //clase que admite genéricos. Puedes hacer instancias de cualquier objeto
    Generic(Type foo, U[] baz) {
        this.foo = foo;
        this.baz = baz;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Byte b = 2;
        Integer i = 22;
        String[] s = {"Carlos", "Gael"};
        Integer[] arr = {i};

        Generic<Integer, String> gen = new Generic<>( i,s);
        // Generic<String, Integer> gen2 = new Generic<>(s[0], arr);
        Generic<Byte, Integer> gen2 = new Generic<>(b, arr);

        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.get(0);
    }


}
