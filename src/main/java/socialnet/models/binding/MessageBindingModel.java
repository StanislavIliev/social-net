package socialnet.models.binding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@ApiModel(description = "Details about the message binding model.")
public class MessageBindingModel extends BaseBindingModel {

    @ApiModelProperty(notes = "The title of the message.")
    private String title;
    @ApiModelProperty(notes = "The content of the message.")
    private String content;
    @ApiModelProperty(notes = "The status of the message.")
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

//    public boolean isReadStatus() {
//        return readStatus;
//    }
//
//    public void setReadStatus(boolean readStatus) {
//        this.readStatus = readStatus;
//    }
}
