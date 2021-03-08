package socialnet.service;

import socialnet.models.servicies.CommentServiceModel;

public interface CommentService {

    CommentServiceModel addComment(CommentServiceModel commentServiceModel);

    boolean deleteComment(String id, String username);

    CommentServiceModel editComment(CommentServiceModel commentServiceModel);

}
