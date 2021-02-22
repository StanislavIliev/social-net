package socialnet.models.servicies;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import socialnet.models.binding.BaseBindingModel;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class PostServiceModel extends BaseServiceModel {


    private String title;
    private String content;
    private LocalDateTime datePosted;
    //TODO : ADD Comment


    public PostServiceModel() {

    }

    @Length(min = 4,max = 25, message = "Title length must be between 3 and 20 symbols!")
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
    @FutureOrPresent(message = "Date cannot be in the past")
    @NotNull
    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }
}
