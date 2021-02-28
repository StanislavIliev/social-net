package socialnet.models.views;

import java.time.LocalDateTime;

public class CommentViewModel {


	private String content;
	// private User author;
	private LocalDateTime dateCreate;

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
	
}
