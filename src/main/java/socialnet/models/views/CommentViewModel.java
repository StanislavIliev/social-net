package socialnet.models.views;

import socialnet.models.entities.User;

import java.time.LocalDateTime;

public class CommentViewModel {


	private String content;

	private UserViewModel author;

	private LocalDateTime dateCreate;

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
