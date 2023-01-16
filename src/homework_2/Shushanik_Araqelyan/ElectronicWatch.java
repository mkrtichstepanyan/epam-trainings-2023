package homework_2.Shushanik_Araqelyan;

public class ElectronicWatch {

    public static void main(String[] args) {
        int hrs = 86400 / 3600; // 1 hour = 60 mins, 1 hour = 3600sec, 60 mins= 60 * 60secs
        int mins = (86400 % 3600) / 60;
        int secs = (86400 % 3600) % 60;
        System.out.println(hrs +"Hours" + mins +"Minutes" + secs +"Seconds");
    }
}