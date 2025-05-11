package EgenRepo;

import java.util.List;
import java.util.UUID;


public interface Repository<T>{
     T GetEntry(UUID uuid);
     List<T> GetAllEntries();

     void AddEntry(T entry);
     void UpdateEntry(T entry);
     void DeleteEntry(T entry);

}
