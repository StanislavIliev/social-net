package socialnet.models.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@ApiModel(description = "Details about the message.")
public class Message extends BaseEntity {

    @ApiModelProperty(notes = "The title of the message.")
    private String title;
    @ApiModelProperty(notes = "The content of the message.")
    private String content;
//    private LocalDateTime dateSent;
    @ApiModelProperty(notes = "The status of the message.")
    private boolean readStatus;

    public Message() {
//        dateSent = LocalDateTime.now();
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

    public boolean isReadStatus() {
        return readStatus;
    }

    public void setReadStatus(boolean readStatus) {
        this.readStatus = readStatus;
    }
}
