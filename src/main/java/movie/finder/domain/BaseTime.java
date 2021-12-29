package movie.finder.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTime {
    
    @CreatedDate    // 시간 자동 저장
    private LocalDateTime createdDate;
    
    /*@LastModifiedDate   // entity 값 변경될때 시간 자동저장
    private LocalDateTime modifiedDate;*/
}
