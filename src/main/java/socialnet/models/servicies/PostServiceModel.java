package socialnet.models.servicies;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

@ApiModel(description = "Details about the post service model.")
public class PostServiceModel extends BaseServiceModel {

    @ApiModelProperty(notes = "The user id of the post.")
    private String userId;
    @ApiModelProperty(notes = "The title of the post.")
    private String title;
    @ApiModelProperty(notes = "The content of the post.")
    private String content;
    @ApiModelProperty(notes = "The posting date of the post.")
    private LocalDateTime datePosted;
//    private List<CommentServiceModel> comments;


    public PostServiceModel() {
        super();
    }

//    public List<CommentServiceModel> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<CommentServiceModel> comments) {
//        this.comments = comments;
//    }
    
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }
}
