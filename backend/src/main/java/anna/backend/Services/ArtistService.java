package anna.backend.Services;

import anna.backend.Dto.ArtistDTO;
import anna.backend.Repositories.ArtistRepository;
import anna.backend.entities.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<ArtistDTO> loadAllArtists(){
        List<Artist> allArtists = this.artistRepository.findAll();
        List<ArtistDTO> dtoArtist =  new ArrayList<>();
        allArtists.forEach(a->
                dtoArtist.add(new ArtistDTO(
                        a.getArtistId(),
                        a.getFirstName(),
                        a.getLastName(),
                        a.getDescription(),
                        a.getImageUrl()
                )));

        return dtoArtist;
    }

    public ArtistDTO getArtistById(long  id){
        Artist a = this.artistRepository.findById(id).orElseThrow(RuntimeException::new);

        ArtistDTO dto = new ArtistDTO(
                a.getArtistId(),
                a.getFirstName(),
                a.getLastName(),
                a.getDescription(),
                a.getImageUrl()
        );
        return dto;
    }
}
