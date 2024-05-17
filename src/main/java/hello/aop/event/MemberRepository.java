package hello.aop.event;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    Member save(Member member);
}
