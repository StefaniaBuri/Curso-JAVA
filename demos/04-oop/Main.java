
public class Main {
    public static void main(String[] args) {

        Character character1;

        character1 = new Character("Zelda", 'F');
        character1.isZombie = true;
        System.out.println(character1.name);
        System.out.println("Is zombie? " + character1.isZombie);
        System.out.println("What type is? " + character1.type);
    }
}
