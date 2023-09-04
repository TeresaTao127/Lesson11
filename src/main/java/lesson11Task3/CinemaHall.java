package lesson11Task3;

public class CinemaHall {
    private final String hallName;
    private final HallType type;


    public CinemaHall(String hallName, HallType type) {
        this.hallName = hallName;
        this.type = type;
    }


    public String getHallName() {
        return hallName;
    }

    public HallType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CinemaHall{" +
                "hallName='" + hallName + '\'' +
                ", type=" + type +
                '}';
    }
}

