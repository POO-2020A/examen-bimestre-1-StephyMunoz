
import java.util.Objects;

public class Passenger {

    private String name;
    private String lastmane;

    public Passenger(String name, String lastmane) {
        this.name = name;
        this.lastmane = lastmane;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastmane;
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
        final Passenger other = (Passenger) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastmane, other.lastmane)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getLastmane() {
        return lastmane;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastmane(String lastmane) {
        this.lastmane = lastmane;
    }

}
