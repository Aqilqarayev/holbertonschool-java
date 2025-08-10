public class PrintStringConcat {
    public static void main(String[] args) {
        String text1 = "Holberton";
        String text2 = "School";
        String result = "Welcome to ".concat(text1).concat(" ").concat(text2).concat(" !") ;
        System.out.println(result);
    }
}
