package controller;

import java.time.LocalDate;
import java.time.LocalTime;
public abstract class purchase extends items {

    protected LocalDate date;
    protected LocalTime time;

    public purchase() {
    }

    public purchase(LocalDate date,LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
