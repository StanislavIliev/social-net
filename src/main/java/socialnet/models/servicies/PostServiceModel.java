package socialnet.models.servicies;

import java.time.LocalDateTime;

public class PostServiceModel extends BaseServiceModel {

	private String userId;
    private String title;
    private String content;
    private LocalDateTime datePosted;
//    private List<CommentServiceModel> comments;


    public PostServiceModel() {
        super();
    }

//    public List<CommentServiceModel> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<CommentServiceModel> comments) {
//        this.comments = comments;
//    }
    
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
