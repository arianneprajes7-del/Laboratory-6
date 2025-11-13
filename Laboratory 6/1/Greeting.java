import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your Name: ");
            String name = reader.readLine();

            System.out.print("Enter your Age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.println("Hello "+ name + "! You are " + age + " years old. ");
        } catch (IOException e) {
            System.out.println("An error occured while reading input. ");
            e.printStackTrace();
        }
    }
}