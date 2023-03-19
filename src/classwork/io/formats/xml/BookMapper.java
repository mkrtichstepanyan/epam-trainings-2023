package classwork.io.formats.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class BookMapper {

    public static void main(String[] args) throws IOException {
        File file = new File("src/classwork/io/formats/xml/book.xml");

        readFromXml(file);

        writeToXml(file);
    }

    private static void readFromXml(File file) throws IOException {
        XmlMapper mapper = new XmlMapper();
        try {
            Book book = mapper.readValue(file, Book.class);
            System.out.println(book);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public static void writeToXml(File file) throws IOException {
        XmlMapper mapper = new XmlMapper();
        String[] authors = new String[3];
        authors[0] = "author1";
        authors[1] = "author2";
        authors[2] = "author3";

        Book book = new Book();
        book.setAuthor("Levon");
        book.setBookTitle("Levon-1");
        book.setAuthorNames(authors);
        mapper.writeValue(file,book);
    }
}
