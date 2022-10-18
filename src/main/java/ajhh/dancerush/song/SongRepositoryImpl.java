package ajhh.dancerush.song;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepositoryImpl implements SongRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    // https://www.baeldung.com/jpa-and-or-criteria-predicates
    @Override
    public List<Song> findAdvanced(String song, String artist, List<String> genre, int[] bpm, int[] easy, int[] normal,
            boolean unlocked) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Song> cq = cb.createQuery(Song.class);

        Root<Song> s = cq.from(Song.class);
        List<Predicate> finalPredicates = new ArrayList<>();

        if (song != "") {
            finalPredicates.add(cb.like(s.get("song"), "%" + song.toLowerCase() + "%"));
        }
        if (artist != "") {
            finalPredicates.add(cb.like(s.get("artist"), "%" + artist.toLowerCase() + "%"));
        }
        if (unlocked == true){
            finalPredicates.add(cb.equal(s.get("unlocked"), unlocked));
        }

        if (genre != null && genre.size() != 0) {
            Predicate genrePredicate = cb.equal(s.get("genre"), genre.get(0));
            for (int i = 1; i < genre.size(); i++) {
                genrePredicate = cb.or(genrePredicate, cb.equal(s.get("genre"), genre.get(i)));
            }
            finalPredicates.add(genrePredicate);
        }

        if(bpm.length == 2 && (bpm[0] != 92 || bpm[1] != 232)){
            finalPredicates.add(cb.between(s.get("bpm"), bpm[0], bpm[1]));
        }

        if(easy.length == 2 && (easy[0] != 1 || easy[1] != 10)){
            finalPredicates.add(cb.between(s.get("easy"), easy[0], easy[1]));
        }

        if(normal.length == 2 && (normal[0] != 1 || normal[1] != 10)){
            finalPredicates.add(cb.between(s.get("easy"), easy[0], easy[1]));
        }

        cq.where(finalPredicates.toArray(new Predicate[0]));
        return entityManager.createQuery(cq).getResultList();
    }

}
