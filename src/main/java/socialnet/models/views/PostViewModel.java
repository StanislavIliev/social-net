package socialnet.models.views;

import java.time.LocalDateTime;

public class PostViewModel extends BaseViewModel{

	private String title;
	private String content;
	// private User author;
	private LocalDateTime datePosted;

	public PostViewModel() {
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
