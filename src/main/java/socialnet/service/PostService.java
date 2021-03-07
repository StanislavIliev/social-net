package socialnet.service;

import socialnet.exceptions.PostDoesNotExistException;
import socialnet.exceptions.exceptionFolder.UserDoesNotExistException;
import socialnet.models.servicies.PostServiceModel;

public interface PostService {

    void createPost(PostServiceModel post) throws UserDoesNotExistException;

    boolean deletePost(String postId) throws PostDoesNotExistException, UserDoesNotExistException;

}
