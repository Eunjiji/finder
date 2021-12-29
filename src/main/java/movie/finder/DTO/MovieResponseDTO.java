package movie.finder.DTO;

import lombok.Getter;
import movie.finder.domain.Movie;

@Getter
public class MovieResponseDTO {

    private Long id;
    private String title;
    private String summary;
    private String actor;

    public MovieResponseDTO(Movie entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.summary = entity.getSummary();
        this.actor = entity.getActor();
    }

}
