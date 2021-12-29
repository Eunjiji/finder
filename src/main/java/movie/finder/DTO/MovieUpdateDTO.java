package movie.finder.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import movie.finder.domain.Movie;

@Getter
@NoArgsConstructor
@Builder
public class MovieUpdateDTO {

    private String title;
    private String summary;

    public MovieUpdateDTO(String title, String summary){
        this.title = title;
        this.summary = summary;
    }

}
