
import java.util.ArrayList;

public class Plane {

    private ArrayList<Seat> seats;
    private int row;
    private int col;
    private String letter;

    public Plane(int row, int col) {
        this.row = row;
        this.col = col;

        if ((row >= 1) && (row <= 20)
                && (col >= 1) && (col <= 8)) {
            switch (col) {
                case 1:
                    this.letter = "A";
                    break;
                case 2:
                    this.letter = "B";
                    break;
                case 3:
                    this.letter = "C";
                    break;
                case 4:
                    this.letter = "D";
                    break;
                case 5:
                    this.letter = "E";
                    break;
                case 6:
                    this.letter = "F";
                    break;
                case 7:
                    this.letter = "G";
                    break;
                case 8:
                    this.letter = "H";
                    break;
                default:
                    break;
            }

        }
        Seat seat = new Seat(row, letter);
        seats.add(seat);
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                output = this.row + " " + this.letter;
            }
        }
        return output;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public String getLetter() {
        return letter;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

}
