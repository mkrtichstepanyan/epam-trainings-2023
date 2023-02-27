package homework_8.Varsik_Pijoyan.chapter_9.PackagesAndInheritances.NestedInterfaces;

class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}
