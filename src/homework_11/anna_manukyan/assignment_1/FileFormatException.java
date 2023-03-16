package homework_11.anna_manukyan.assignment_1;

public class FileFormatException extends Throwable {


    @Override
    public String toString() {
        return "File can have only .txt, .csv and .json formats";
    }
}
