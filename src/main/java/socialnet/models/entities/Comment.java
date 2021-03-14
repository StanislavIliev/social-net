package socialnet.models.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
@ApiModel(description = "Details about the comment.")
public class Comment extends BaseEntity {

    @ApiModelProperty(notes = "The content of the comment.")
    private String content;
    @ApiModelProperty(notes = "The author of the comment.")
    private User author;
    @ApiModelProperty(notes = "The date of the creation of the comment.")
    private LocalDateTime dateCreate = LocalDateTime.now();
    @ApiModelProperty(notes = "The update date of the comment.")
    private LocalDateTime updatedOn = LocalDateTime.now();

    public Comment() {
        super();
    }


    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "date_create", nullable = false)
    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
    }

    @ManyToOne
	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }
}
