package socialnet.models.servicies;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

public class PostServiceModel extends BaseServiceModel {


    private String title;
    private String content;
    private LocalDateTime datePosted;
    private List<CommentServiceModel> comments;


    public PostServiceModel() {
        super();
    }

    public List<CommentServiceModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentServiceModel> comments) {
        this.comments = comments;
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

    @FutureOrPresent(message = "Date cannot be in the past")
    @NotNull
    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }
}
