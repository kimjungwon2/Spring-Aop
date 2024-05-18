package hello.aop.eventpublisher;

import org.springframework.context.ApplicationEvent;


public class EmailSendEvent extends ApplicationEvent {

    private final String email;

    public EmailSendEvent(String email, Object source) {
        super(source);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}