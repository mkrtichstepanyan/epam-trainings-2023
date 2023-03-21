package classwork.io.jsonparser;



import java.io.File;
import java.io.IOException;

public class BookJsonMapper {

    public static void main(String[] args) {
        read();

//        writer();


    }

    private static void writer() {
        ObjectMapper om  = new ObjectMapper();
        om.configure(SerializationFeature.INDENT_OUTPUT, true);
        try {
            Book book = new Book();
            book.setName("my book");
//            book.setPageCount(150);
            Book.Author author = new Book.Author();
            author.setName("Badalyan");
            book.setAuthors(new Book.Author[]{author, author});
            om.writeValue(new File("src/classwork/io/jsonparser/new-book-2.json"), book );
        } catch (JsonProcessingException e) {
            System.out.println("Can not write a file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void read() {
        ObjectMapper om = new ObjectMapper();

        om.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        File file = new File("src/classwork/io/jsonparser/new-book-2.json");
        try {
            Book [] book = om.readValue(file, Book[].class);

            for (Book book1 : book) {
                System.out.println(book1);
            }
        } catch (IOException e) {

            System.out.println("Can not read file.");
        }
    }
}
