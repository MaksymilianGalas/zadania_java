package zad3;

public class MojaData {
    private int day;
    private int month;
    private int year;

    public MojaData(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public String AtoString() {
        return String.format("%d.%d.%d", day, month, year);

    }
    public String BtoString() {
        return String.format("%02d.%02d.%d", day, month, year);

    }
    public String CtoString() {
        String[] months = {"sty", "lut", "mar", "kwi", "maj", "cze", "lip", "sie", "wrz", "paź", "lis", "gru"};
        return String.format("%d %s %d", day, months[month-1], year);
    }
}

