package socialnet.models.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

@ApiModel(description = "Details about the message.")
public class PostViewModel extends BaseViewModel{

	@ApiModelProperty(notes = "The title of the post.")
	private String title;
	@ApiModelProperty(notes = "The content of the post.")
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
