import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import javarest.spring.Application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;

public class ContextFactory {

    @Value("${Context}")
    private String connectionString;
    public void getContext(){

       var em = Persistence.createEntityManagerFactory("context");
       var context = em.createEntityManager();

    }
}
