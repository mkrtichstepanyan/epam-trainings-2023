package homework_12.Roza_Petrosyan.task.assignment_one.exception;

public class FileExtensionException extends RuntimeException{
    public FileExtensionException(){
        super("Files only with .txt, .csv and .json extensions are allowed to use.");
    }
}
