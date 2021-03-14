package socialnet.models.binding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@ApiModel(description = "Details about the comment binding model.")
public class CommentBindingModel extends BaseBindingModel {

	@ApiModelProperty(notes = "The content of the comment.")
	private String content;
	@ApiModelProperty(notes = "The author of the comment.")
	private String author;
	@ApiModelProperty(notes = "The date of the creation of the comment.")
	private LocalDateTime dateCreate;
	@ApiModelProperty(notes = "The update date of the comment.")
	private LocalDateTime updatedOn;

	public CommentBindingModel() {
		super();
	}

	@NotBlank
	@Length(min = 1, message = "Comment must have at least 1 character")
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
}
