package socialnet.service;

import socialnet.models.servicies.PostServiceModel;

public interface PostService {

    PostServiceModel createPost(PostServiceModel post, String userId);

    boolean deletePost(String postId);

}
