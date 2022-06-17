import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author();

        System.out.println(firstAuthor.getNationality());
        firstAuthor.setNationality("Romanian");

        System.out.println(firstAuthor.getNationality());
        firstAuthor.setName("Liviu Ionel");
        System.out.println(firstAuthor.getName());
    }
}
