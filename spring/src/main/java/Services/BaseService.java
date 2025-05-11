package Services;

import EgenRepo.BaseRepository;
import Model.BasicEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseService {

    private final BaseRepository repo;

    public BaseService(BaseRepository repo) {
        this.repo = repo;
    }


    public List<BasicEntry> GetAll(){
        return repo.findAll();
    }
    }
