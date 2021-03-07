package socialnet.models.views;

import java.time.LocalDateTime;

public class PostViewModel extends BaseViewModel{

	private String title;
	private String content;

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
}
