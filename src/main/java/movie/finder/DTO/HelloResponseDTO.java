package movie.finder.DTO;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter     // 필드의 getter 생성
@RequiredArgsConstructor        // 선언된 모든 final의 생성자를 만들어줌
public class HelloResponseDTO {

    private final String name;
    private final int amount;
}
