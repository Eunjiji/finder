package movie.finder.repository;

import lombok.RequiredArgsConstructor;
import movie.finder.domain.Movie;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor    //final이 붙거나 하는 변수의 생성자를 자동으로 생성해주는 어노테이션
public class MovieRepository {

    private final EntityManager em;

    @Transactional
    public Movie save(Movie movie){
        em.persist(movie);
        return movie;
    }


    public List<Movie> findAll() {
        return em.createQuery("select m from Movie m", Movie.class).setMaxResults(6).getResultList();
    }

    public Movie findById(Long id) {
        return em.find(Movie.class, id);
    }

    public Movie findByMovie(String id) {
        return em.find(Movie.class, id);
    }
}
