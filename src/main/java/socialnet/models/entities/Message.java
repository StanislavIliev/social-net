package socialnet.models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message extends BaseEntity {

    private String title;
    private String content;
    private LocalDateTime dateSent = LocalDateTime.now();
    private User author;
    private User recipient;
    private boolean status;

    public Message() {
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "TEXT", nullable = false)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    @Column(name = "date_sent", nullable = false)
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
//    public LocalDateTime getDateSent() {
//        return dateSent;
//    }
//
//    public void setDateSent(LocalDateTime dateSent) {
//        this.dateSent = dateSent;
//    }

    @ManyToOne
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @OneToOne
    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
