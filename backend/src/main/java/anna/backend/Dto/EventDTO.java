package anna.backend.Dto;

import anna.backend.entities.Rating;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventDTO {
    private String title;
    private String location;
    private LocalDate eventDate;
    private String imageUrl;

    private List<String> artists;
    private List<Rating> ratings;
}
