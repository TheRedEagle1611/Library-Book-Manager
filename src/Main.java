import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Add book");
            System.out.println("2. Recieve book data");
            System.out.println("3. Recieve number of books");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Input book title:");
                    String title = scanner.nextLine();
                    System.out.println("Input book author:");
                    String author = scanner.nextLine();
                    System.out.println("Input book pages:");
                    int pages = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(title, author, pages);
                    library.addBook(book);

                    break;

                case 2:
                    System.out.println(library.toString());
                    break;

                case 3:
                    System.out.println(library.size());
                    break;

            }


        }
    }
}
