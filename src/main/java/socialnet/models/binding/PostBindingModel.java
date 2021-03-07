package socialnet.models.binding;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class PostBindingModel extends BaseBindingModel {

	private String userId;
    private String title;
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
