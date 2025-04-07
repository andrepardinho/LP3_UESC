package andrePardinho.listas.cap3;

import java.sql.SQLOutput;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;

        validateDate();
    }

    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }

    public void setDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
        validateDate();
    }

    private void validateDate(){
        if(!isValid(this)){
            if (this.day == 0 && this.month == 0 && this.year == 0){
                return;
            }
            System.out.println("Data invalida (" + this + ")");
            setDate(0, 0, 0);
        }
    }

    private boolean isValid(Date Date) {
        if(Date.month < 1 || Date.month > 12 || Date.day < 1) {
            return false;
        }

        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(Date.year)) dayOfMonth[1] = 29;

        return Date.day <= dayOfMonth[Date.month - 1];


    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /*
    public void displayDate( ) {
        System.out.printf("%02d/%02d/%d\n", day, month, year);
    }
    */

    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }
}
