package uaslp.objetos.parcial1.time;

public class Main {

    public static void main(String[] args) {

        Time time = new Time(9,45, 23);
        System.out.println(time.toString());

        Time time2 = new Time(10, 59, 55);
        while(true) {
            time2.addSecond(1);
            System.out.println("Hour: " + time2.getHour() + " Minute: " + time2.getMinute() + " Second: " + time2.getSecond());
        }
    }
}
