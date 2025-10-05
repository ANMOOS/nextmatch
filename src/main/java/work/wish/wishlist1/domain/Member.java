package work.wish.wishlist1.domain;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id; // 회원 번호 (PK)

    @Column(nullable = false, unique = true, length = 50)
    private String username; // 아이디

    @Column(nullable = false, length = 255) // 암호화된 비밀번호를 위해 넉넉한 길이
    private String password; // 비밀번호

    @Column(nullable = false, length = 100)
    private String name; // 이름

    @Column(length = 20)
    private String phoneNumber; // 전화번호

    @Column(unique = true, length = 100)
    private String email; // 이메일

    // 이 엔티티에 MyPageHistory 엔티티(전적 기록)는 포함되지 않았습니다.
    // 히스토리 기록이 필요하다면 별도의 History 엔티티를 만들어 Member와 연결해야 합니다.
}