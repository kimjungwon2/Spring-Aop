package hello.aop.event;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public void signUp() {
        applicationEventPublisher.publishEvent("welcome"); // 이벤트 발행 즉시 리스너 동작
        log.info("-- signUp end --");
    }
}
