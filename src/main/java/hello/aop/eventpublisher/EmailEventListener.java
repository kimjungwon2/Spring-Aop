package hello.aop.eventpublisher;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailEventListener {

    private final SesService sesService;

    @EventListener
    public void onEmailSendEventHandler(EmailSendEvent event) {
        // 이메일 전송
        sesService.sendEmail(event.getEmail());
    }
}