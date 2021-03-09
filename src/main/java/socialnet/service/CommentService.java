package socialnet.service;

import socialnet.exceptions.CommentException;
import socialnet.models.servicies.CommentServiceModel;

public interface CommentService {

    CommentServiceModel addComment(CommentServiceModel commentServiceModel);

    boolean deleteComment(String id, String username) throws CommentException;

    CommentServiceModel editComment(CommentServiceModel commentServiceModel) throws CommentException;

}
