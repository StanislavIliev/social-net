package socialnet.models.servicies;

public class MessageServiceModel extends BaseServiceModel {

    private String title;
    private String content;

    public MessageServiceModel() {
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
}
