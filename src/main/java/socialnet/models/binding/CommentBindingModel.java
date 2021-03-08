package socialnet.models.binding;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class CommentBindingModel {

	private String content;

	private String author;

	private LocalDateTime dateCreate;

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
	
}
