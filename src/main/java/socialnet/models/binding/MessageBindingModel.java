package socialnet.models.binding;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class MessageBindingModel extends BaseBindingModel {

    private String title;
    private String content;
    private String senderId;
    private String recipientId;

    private boolean readStatus;
    //TODO SQL injection prevention

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

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }


}
