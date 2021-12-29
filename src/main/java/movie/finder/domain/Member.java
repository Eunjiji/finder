package movie.finder.domain;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "members")
public class Member extends BaseTime{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    private String password;

    private String interest;

    private String email;

    @Enumerated(EnumType.STRING)
    private LoginMethod method;

    @Enumerated(EnumType.STRING)
    private Auth auth;

//    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "member")
    private List<Favorite> favorites = new ArrayList<>();


}
