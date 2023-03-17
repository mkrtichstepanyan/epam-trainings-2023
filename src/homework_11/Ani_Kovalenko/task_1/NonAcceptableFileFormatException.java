package homework_11.Ani_Kovalenko.task_1;

public class NonAcceptableFileFormatException extends Exception {

    @Override
    public String getMessage() {
        return "Please use only acceptable file format. That is: .txt; .csv; .json";
    }

}
