package anna.backend.db;

import anna.backend.entities.Artist;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
@Slf4j
public class DbInit {


    @PostConstruct
    public void init(){
        try{
            log.info("---About to init database---");

            InputStream is = getClass().getResourceAsStream("/data.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());

            List<Artist> artists = mapper.readerForListOf(Artist.class).readValue(is);
            log.info("Load {} values", artists.size());
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
