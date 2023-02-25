package homework_8.Anushik_Gevorgyan.Interface;

class B implements A.NestedIF{
    public boolean  isNotNegative(int x){
        return x < 0 ? false: true;
    }
}
