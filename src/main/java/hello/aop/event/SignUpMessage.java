package hello.aop.event;

public class SignUpMessage {
    private String contents;
    private String from;

    public SignUpMessage(String contents, String from) {
        this.contents = contents;
        this.from = from;
    }

    public String getContents() {
        return contents;
    }

    public String getFrom() {
        return from;
    }
}