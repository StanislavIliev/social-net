package socialnet.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import socialnet.exceptions.PostDoesNotExistException;
import socialnet.exceptions.exceptionFolder.UserDoesNotExistException;
import socialnet.models.entities.Post;
import socialnet.models.entities.User;
import socialnet.models.servicies.PostServiceModel;
import socialnet.repository.PostRepository;
import socialnet.repository.UserRepository;
import socialnet.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	private final UserRepository userRepository;
	private final ModelMapper modelMapper;
	private final PostRepository postRepository;

	@Autowired
	public PostServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PostRepository postRepository) {
		this.userRepository = userRepository;
		this.modelMapper = modelMapper;
		this.postRepository = postRepository;
	}

	@Override
    public void createPost(PostServiceModel inputPost) throws UserDoesNotExistException {
    	User u = this.userRepository.findById(inputPost.getUserId()).orElse(null);
    	if(u == null) throw new UserDoesNotExistException("User does not exist exception!");
    	Post createdPost = this.modelMapper.map(inputPost, Post.class);
    	this.postRepository.saveAndFlush(createdPost);
    }

	@Override
	public boolean deletePost(String postId) throws PostDoesNotExistException, UserDoesNotExistException {
		Post post = this.postRepository.findById(postId).orElse(null);
    	if(post == null) throw new PostDoesNotExistException("Post does not exist exception!");
    	User u = this.userRepository.findById(post.getUserId()).orElse(null);
    	if(u == null) throw new UserDoesNotExistException("User does not exist exception!");
    	u.getPosts().remove(post);
    	this.userRepository.saveAndFlush(u);
		boolean isDeleted = false;
		try {
			this.postRepository.deleteById(postId);
			isDeleted = true;
		} catch (Exception ignored) {}
		return isDeleted;
	}
}
