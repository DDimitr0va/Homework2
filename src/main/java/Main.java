
public class Main {

    public static void main(String[] args) {
        String myString1 = "My name is %s";
        System.out.println(myString1.replace("My", "Your"));
        String[] words = myString1.split(" ");
        System.out.println(words.length);
        System.out.println(myString1.equals("My name is "));
        System.out.println(String.format(myString1, "Desislava"));
    }
}


