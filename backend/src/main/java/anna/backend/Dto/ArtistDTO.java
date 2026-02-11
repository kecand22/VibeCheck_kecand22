package anna.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtistDTO {
    private Long artistId;

    private String firstname;
    private String lastname;
    private String description;
    private String imageUrl;
}
