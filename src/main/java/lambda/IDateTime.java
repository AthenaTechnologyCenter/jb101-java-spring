package lambda;

import java.time.LocalDate;

public interface IDateTime {
    LocalDate compareBetweenDate(LocalDate startDate, LocalDate endDate);

}
