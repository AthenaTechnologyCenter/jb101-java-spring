package lambda;

import java.time.LocalDate;

public class DateTimeImplement {
    public static void main(String[] args) {
        IDateTime dateTimeHandle = (startDate, endDate) -> {
            if (startDate.isBefore(endDate)) {
                return startDate;
            }
            return endDate;
        };

        System.out.println(dateTimeHandle.compareBetweenDate(LocalDate.now(), LocalDate.now().minusDays(10)));
    }

}
