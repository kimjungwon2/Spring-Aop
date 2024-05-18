package hello.aop.eventpublisher;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailEventListener {

    private final SesService sesService;

    @Async
    @EventListener
    public void onEmailSendEventHandler(EmailSendEvent event) {
        // Send email
        sesService.sendEmail(event.getEmail());
    }
}