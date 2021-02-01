public class Main {

    public static void main(String[] args) {
        String myString1 = "My name is Test";
        System.out.println(myString1);
        myString1 = myString1.replace("Test", "Desislava");
        System.out.println(myString1);
        String[] words = myString1.split(" ");
        System.out.println(words.length);
        String myString2 = "My name is Desislava";
        System.out.println(myString1.equalsIgnoreCase(myString2));
        String myString3 = ".";
        System.out.println(myString1 + myString3);

    }
}
