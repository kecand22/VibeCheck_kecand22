package anna.backend.db;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.InputStream;

@Component
@Slf4j
public class DbInit {
    @PostConstruct
    public void init(){
        log.info("---About to init database---");

        InputStream is = getClass().getResourceAsStream("data.json");
        log.info();
    }
}
