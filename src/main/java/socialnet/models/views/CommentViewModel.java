package socialnet.models.views;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

@ApiModel(description = "Details about the message.")
public class CommentViewModel {


	@ApiModelProperty(notes = "The content of the comment.")
	private String content;
	@ApiModelProperty(notes = "The author of the comment.")
	private UserViewModel author;
	@ApiModelProperty(notes = "The creation date of the comment.")
	private LocalDateTime dateCreate;
	@ApiModelProperty(notes = "The date of update of the comment.")
	private LocalDateTime updatedOn;

	public CommentViewModel() {
		super();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(LocalDateTime dateCreate) {
		this.dateCreate = dateCreate;
	}

	public UserViewModel getAuthor() {
		return author;
	}

	public void setAuthor(UserViewModel author) {
		this.author = author;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
}
