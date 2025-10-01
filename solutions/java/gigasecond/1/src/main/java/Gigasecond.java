import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private final LocalDateTime gigaDateTime;

    public Gigasecond(LocalDate moment) {
        this.gigaDateTime = moment.atStartOfDay().plusSeconds(1000000000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.gigaDateTime = moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return gigaDateTime;
    }
}