package javarest.spring;

import Model.BasicEntry;

import Services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import EgenRepo.BaseRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@Controller
public class HomeController {

    private final BaseService service;

    public HomeController(BaseService service) {
        this.service = service;
    }

    @GetMapping("/testmethod")  // <- critical fix
    public List<BasicEntry> test() {
        return service.GetAll();
    }
}

