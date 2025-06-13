public class Horror {

    public static void main(String[] args) {

        //Bucle infinito
        for (int index = 0; index >= 0; index++) {
            System.out.println("Horror " + index);

            //Agregamos un centinela(flag) para parar el bucle
            if(index >= 100) {
                break;
            }
        }
    }
}
