package local.lambdas;

public class LambdasApp {
    public static void main(String[] args) {
        Compose compose = new Compose();
        //System.out.println(compose.execute("Pintar"));
        
        LambdaString make = (String txt) -> { return "Info recibida " + txt;};
        System.out.println(make.execute("Pintar"));

        LambdaString make2 = (String txt) -> "Info almacenada " + txt;
        System.out.println(make2.execute("Hola"));
    }
}
