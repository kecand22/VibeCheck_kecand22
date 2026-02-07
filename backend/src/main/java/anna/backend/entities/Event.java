package anna.backend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventID;

    private String title;
    private String location;
    private LocalDate eventDate;
    private String imageURl;

    @ManyToMany(
           mappedBy = "events"

    )
    private List<Artist> artists;

}
