
import java.util.ArrayList;
import java.util.Objects;

public class Seat {

    private int row;
    private String col;
    private Passenger passenger;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;

    }

    public boolean isFree() {
        if (this.passenger == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (isFree()) {
            return "Asiento: " + this.row + this.col + ", libre";
        }
        return "Asiento: " + this.row + this.col + ", ocupado. Pasajero " + this.passenger.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seat other = (Seat) obj;
        if (this.row != other.row) {
            return false;
        }
        if (!Objects.equals(this.col, other.col)) {
            return false;
        }
        return true;
    }

    public String getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

}
