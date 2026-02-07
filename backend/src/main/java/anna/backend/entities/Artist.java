package anna.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Artist {
    @Id
    @JsonIgnore()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long artistId;

    private String firstname;
    private String lastname;
    private String description;
    private String imageUrl;

    @ManyToMany(
            cascade = CascadeType.PERSIST
    )
    @JoinTable(
            name = "event_artist",
            joinColumns = @JoinColumn(name = "artist_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )


    private List<Event> events;
}
