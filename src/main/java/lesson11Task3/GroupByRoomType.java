package lesson11Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import static lesson11Task3.HallType.*;

public class GroupByRoomType {
    public static void main(String[] args) {
        CinemaHall familyCinemaHall =new CinemaHall("Family",TWOD);
        CinemaHall projectorCinemaHall=new CinemaHall("Projector", THREED);
        CinemaHall tivoliCinemaHall=new CinemaHall("Tivoli",TWOD);
        CinemaHall sunCinemaHall=new CinemaHall("Sun", THREED);
        CinemaHall grandCinemaHall=new CinemaHall("Grand", FOURD);
        CinemaHall cornerCinemaHall=new CinemaHall("Corner", THREED);
        CinemaHall musicBoxCinemaHall=new CinemaHall("Music Box", FOURD);
        CinemaHall parkCinemaHall=new CinemaHall("Park", TWOD);
        CinemaHall stellaCinemaHall=new CinemaHall("Stella", THREED);
        CinemaHall artCinemaHall=new CinemaHall("Art", FOURD);

        List<CinemaHall> cinemaHalls= Arrays.asList(familyCinemaHall,projectorCinemaHall,tivoliCinemaHall,sunCinemaHall,grandCinemaHall,cornerCinemaHall,musicBoxCinemaHall,parkCinemaHall,stellaCinemaHall,artCinemaHall);
        Map<HallType, Long> groupedCinemaHalls
                =cinemaHalls.stream().collect(Collectors.groupingBy(CinemaHall::getType, Collectors.counting()));
        System.out.println(groupedCinemaHalls);
        groupedCinemaHalls.forEach(((hallType, count) -> System.out.println(hallType + ": "+ count) ));
    }
}
