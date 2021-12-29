package movie.finder.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
public class Movie extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MOVIE_ID")
    private Long id;

    private String title;

    @Column(length = 1000)
    private String summary;

    private String openingDate;

    private String genre;

    private String actor;

    private String country;

    private Double grade;

    @Column(length = 1000)
    private String posterImage;

    @OneToMany(mappedBy = "movie")
    private List<Favorite> favorite = new ArrayList<>();

    public void update(String title, String summary){
        this.title = title;
        this.summary = summary;
    }

    public static Movie addMovie(String title, String summary, String actor){
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setSummary(summary);
        movie.setActor(actor);
        return movie;
    }


}
