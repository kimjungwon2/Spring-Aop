package hello.aop.event;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MemberListener {

    @TransactionalEventListener(phase = TranscationPhase.AFTER_COMMIT)
    public void listener(String message) {
        log.info(message);
    }


}
