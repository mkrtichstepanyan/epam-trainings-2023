package homework_8.Eduard_Eghiazaryan;

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}