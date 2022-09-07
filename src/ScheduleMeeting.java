import org.w3c.dom.ranges.Range;

import java.time.Duration;
import java.time.LocalTime;

public class ScheduleMeeting {

    public static void main(String[] args) {
        LocalTime duration = LocalTime.of(0,30);

        ScheduleDate tejasDate = new ScheduleDate(LocalTime.of(7,00),
                LocalTime.of(9,00));
        ScheduleDate raviDate = new ScheduleDate(LocalTime.of(7,00),
                LocalTime.of(11,00));


        if( (raviDate.getStartDate().equals(tejasDate.getStartDate()) || raviDate.getStartDate().isAfter(tejasDate.getStartDate()) )
                  &&
                (raviDate.getEndDate().equals(tejasDate.getEndDate()) || raviDate.getEndDate().isBefore(tejasDate.getEndDate()))
            ) {
            System.out.println("Within range");
        }

    }
}


class ScheduleDate {
    LocalTime startDate;
    LocalTime endDate;

    public ScheduleDate(LocalTime startDate, LocalTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalTime startDate) {
        this.startDate = startDate;
    }

    public LocalTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalTime endDate) {
        this.endDate = endDate;
    }

    public Boolean getIsWithinRange(LocalTime givenTime) {
        return givenTime.isAfter(this.startDate) && givenTime.isBefore(this.endDate);
    }
}

