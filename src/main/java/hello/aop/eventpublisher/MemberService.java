package hello.aop.eventpublisher;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto) {
        Member member = memberRepository.save(signUpRequestDto.toEntity());
        applicationEventPublisher.publishEvent(new EmailSendEvent(member.getEmail(), this));
        return new SignUpResponseDto(member.getId());
    }
}
