package homework_8.Roza_Petrosyan.Chapter_9.Default;

public class MyIFImpl implements MyIF{
    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString(){
        return "This is a different String";
    }

}
