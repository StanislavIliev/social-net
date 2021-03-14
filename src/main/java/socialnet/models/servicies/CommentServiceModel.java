package socialnet.models.servicies;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
@ApiModel(description = "Details about the comment service model.")
public class CommentServiceModel extends BaseServiceModel{


	@ApiModelProperty(notes = "The content of the comment.")
	private String content;
	@ApiModelProperty(notes = "The author of the comment.")
	private UserServiceModel author;
	@ApiModelProperty(notes = "The date of creation of the comment.")
	private LocalDateTime dateCreate;
	@ApiModelProperty(notes = "The update date of the comment.")
	private LocalDateTime updatedOn;

	public CommentServiceModel() {
		super();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public UserServiceModel getAuthor() {
		return author;
	}

	public void setAuthor(UserServiceModel author) {
		this.author = author;
	}

	public LocalDateTime getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(LocalDateTime dateCreate) {
		this.dateCreate = dateCreate;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
}
