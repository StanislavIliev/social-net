package socialnet.models.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

@ApiModel(description = "Details about the message view model.")
public class MessageViewModel extends BaseViewModel {

    @ApiModelProperty(notes = "The title of the message.")
    private String title;
    @ApiModelProperty(notes = "The content of the message.")
    private String content;
    @ApiModelProperty(notes = "The date of sending of the message.")
    private LocalDateTime dateSent;
    @ApiModelProperty(notes = "The status of the message.")
    private boolean readStatus;

    public MessageViewModel() {
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

    public boolean isReadStatus() {
        return readStatus;
    }

    public void setReadStatus(boolean readStatus) {
        this.readStatus = readStatus;
    }
}
