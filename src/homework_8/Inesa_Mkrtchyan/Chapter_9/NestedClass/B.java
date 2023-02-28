package homework_8.Inesa_Mkrtchyan.Chapter_9.NestedClass;

class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}
