package socialnet.models.binding;

import java.time.LocalDateTime;

public class CommentBindingModel {

	private String title;
	private String content;
	// private User author;
	private LocalDateTime dateCreate;

	public CommentBindingModel() {
		super();
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

	public LocalDateTime getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(LocalDateTime dateCreate) {
		this.dateCreate = dateCreate;
	}
	
}
