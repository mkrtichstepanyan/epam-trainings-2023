package homework_12.Ani_Kovalenko.task_1;

public class NonAcceptableFileFormatException extends Exception {

    @Override
    public String getMessage() {
        return "Please use only acceptable file format. That is: .txt; .csv; .json";
    }
}
