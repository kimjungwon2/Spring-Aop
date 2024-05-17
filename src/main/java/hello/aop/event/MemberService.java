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
        Member savedMember = memberRepository.save(dto.toEntity());
        SignUpMessage signUpMessage = new SignUpMessage("welcome", savedMember.getName());
        applicationEventPublisher.publishEvent(signUpMessage);
        log.info("-- signUp end --");
    }
}
