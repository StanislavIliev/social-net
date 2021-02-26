package socialnet.models.servicies;

import java.time.LocalDateTime;

public class MessageServiceModel {

    private String title;
    private String content;
    private LocalDateTime dateSent;

    public MessageServiceModel() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDateTime dateSent) {
        this.dateSent = dateSent;
    }
}
