package movie.finder.DTO;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MemberDTO {

    private Long id;
    private String email;

}
