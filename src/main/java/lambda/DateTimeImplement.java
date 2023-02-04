package lambda;

import java.time.LocalDate;

public class DateTimeImplement {
    public static void main(String[] args) {
        IDateTime dateTimeHandle = (ageSt, ageSd) -> {
            if (ageSt.isBefore(ageSd)) {
                return ageSt;
            }
            return ageSd;
        };

        System.out.println(dateTimeHandle.compareBetweenDate(LocalDate.now(), LocalDate.now().minusDays(10)));
    }

}
