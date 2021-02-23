package socialnet.models.binding;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class MessageBindingModel {

    private String title;
    private String content;
    private LocalDateTime dateSent;
    //TODO Author and Recipient must be added

    public MessageBindingModel() {
    }

    @NotBlank
    @Length(min = 1, max = 25, message = "Title length must be between 1 and 20 symbols!")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NotBlank
    @Length(min = 1, message = "Are you sure you want to send empty message?")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //TODO - date and time must be set to exact sent-time may be???

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @FutureOrPresent(message = "Date cannot be in the past")
    @NotNull
    public LocalDateTime getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDateTime dateSent) {
        this.dateSent = dateSent;
    }
}
