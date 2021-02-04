import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        // we can refer to AddressBook directly because its implementations are static
        AddressBook.addAll(
                new Entry("Randy",
                        "Savage",
                        "123-123-1234",
                        "funkylikeamonkey@savage.com"),
                new Entry("Dwayne",
                        "Johnson",
                        "123-123-1234",
                        "therock@teramana.com"),
                new Entry("Mark",
                        "Henry",
                        "123-123-1234",
                        "sexychocolate@aol.com")
        );


        Scanner scanner = new Scanner(System.in);
        Prompts.makeSelection(scanner);


    }

}