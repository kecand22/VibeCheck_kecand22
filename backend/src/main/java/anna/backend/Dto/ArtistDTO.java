package anna.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtistDTO {
    private Long artistId;

    private String firstName;
    private String lastName;
    private String description;
    private String imageUrl;
}
