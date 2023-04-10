package homework_12.Karen_Sargsyan.assignment_1;

public class NonAcceptableFileFormatException extends Exception {
    public String getMessage() {
        return "Please use only acceptable file format. That is: .txt, .csv, .json";
    }

}
