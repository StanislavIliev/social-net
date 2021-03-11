package socialnet.models.binding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@ApiModel(description = "Details about the post binding model.")
public class PostBindingModel extends BaseBindingModel {

    @ApiModelProperty(notes = "The user id of user who made the post.")
    private String userId;
    @ApiModelProperty(notes = "The title of the post.")
    private String title;
    @ApiModelProperty(notes = "The content of the post.")
    private String content;

    public PostBindingModel() {

    }

    @Length(min = 4, max = 25, message = "Title length must be between 3 and 20 symbols!")
    @NotBlank
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Length(min = 3, message = "Title length must be minimum 3 symbols!")
    @NotBlank
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
//    @FutureOrPresent(message = "Date cannot be in the past")
//    @NotNull
//    public LocalDateTime getDatePosted() {
//        return datePosted;
//    }
//
//    public void setDatePosted(LocalDateTime datePosted) {
//        this.datePosted = datePosted;
//    }
}
