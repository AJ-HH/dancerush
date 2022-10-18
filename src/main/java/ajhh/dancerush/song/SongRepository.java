package ajhh.dancerush.song;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// First generic is what is being returned, and the second is the identifier
public interface SongRepository extends CrudRepository<Song, Integer>, SongRepositoryCustom {
    @Query("SELECT s FROM Song s WHERE LOWER(s.song) LIKE CONCAT('%', LOWER(:song), '%')")
    List<Song> findSongs(String song);
}