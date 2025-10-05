package com.project.nextmatch.repository;

import com.project.nextmatch.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// Member 엔티티 (PK 타입은 Long)를 다루는 Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 필요한 경우, 나중에 findByUsername 등의 커스텀 메서드를 추가할 수 있습니다.
}