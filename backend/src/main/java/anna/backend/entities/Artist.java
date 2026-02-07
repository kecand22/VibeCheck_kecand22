package anna.backend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long artistID;

    private String firstname;
    private String lastname;
    private String description;
    private String imageURL;

    @ManyToMany(
            mappedBy = "artists"
    )

    private List<Event> events;
}
