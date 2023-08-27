import java.time.LocalTime;

public class Airplane {
    LocalTime departure_time;
    String flight_number, destination;
    int delay_time;

    Airplane(String flight_number, LocalTime departure_time, String destination) {

        this.flight_number = flight_number;
        this.departure_time = departure_time;
        this.destination = destination;
        this.delay_time = 0;
    }

    void get_delay() {
        System.out.println("Flight " + this.flight_number + " is delay by  " + this.delay_time + " minutes");
    }

    void delay(int minutes) {
        this.delay_time = minutes;
        this.departure_time = this.departure_time.plusMinutes(minutes);
    }

    void flight_status() {
        if (delay_time == 0) {
            System.out.println("Flight : " + flight_number + " is on time");
        } else {
            System.out.println("Flight : " + flight_number + " is Delay by " + departure_time);
        }
    }

    public static void main(String[] args) {
        Airplane f1 = new Airplane("c11", LocalTime.of(12, 30), "London");
        Airplane f2 = new Airplane("911", LocalTime.of(2, 0), "America");
        Airplane f3 = new Airplane("b33", LocalTime.of(10, 0), "Canada");

        f1.flight_status();
        f2.flight_status();
        f3.delay(60);
        f3.flight_status();
        f3.get_delay();

    }
}
