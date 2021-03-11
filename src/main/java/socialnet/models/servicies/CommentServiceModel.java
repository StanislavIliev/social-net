package socialnet.models.servicies;

import java.time.LocalDateTime;

public class CommentServiceModel extends BaseServiceModel{


	private String content;
	private UserServiceModel author;
	private LocalDateTime dateCreate;
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
