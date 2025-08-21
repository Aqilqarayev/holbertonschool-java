package task2;

import task2.Character;

public class Program {
    public static void main(String[] args) {
        boolean characterInUppercase1 = Character.isUpper('a');
        boolean characterInUppercase2 = Character.isUpper('B');
        boolean characterInUppercase3 = Character.isUpper('d');
        boolean characterInUppercase4 = Character.isUpper('f');
        boolean characterInUppercase5 = Character.isUpper('G');

        System.out.printf("%b\n", characterInUppercase1);
        System.out.printf("%b\n", characterInUppercase2);
        System.out.printf("%b\n", characterInUppercase3);
        System.out.printf("%b\n", characterInUppercase4);
        System.out.printf("%b\n", characterInUppercase5);
    }
}
