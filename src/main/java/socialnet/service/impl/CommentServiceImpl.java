package socialnet.service.impl;

import io.swagger.annotations.ApiModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import socialnet.exceptions.CommentException;
import socialnet.models.entities.Comment;
import socialnet.models.entities.User;
import socialnet.models.servicies.CommentServiceModel;
import socialnet.repository.CommentRepository;
import socialnet.repository.UserRepository;
import socialnet.service.CommentService;

import java.time.LocalDateTime;

@Service
@ApiModel(description = "Details about the comment service.")
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository, ModelMapper modelMapper, UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public CommentServiceModel addComment(CommentServiceModel commentServiceModel) {
        Comment comment = this.modelMapper.map(commentServiceModel, Comment.class);
        User author = this.modelMapper.map(commentServiceModel.getAuthor(), User.class);
        if (author == null){
            throw new UsernameNotFoundException("Cannot find user");
        }
        comment.setAuthor(author);
        this.commentRepository.saveAndFlush(comment);
        return this.modelMapper.map(comment, CommentServiceModel.class);
    }

    @Override
    public boolean deleteComment(String id, String username) throws CommentException {
       Comment comment = this.commentRepository.findById(id).orElse(null);
       if (comment == null){
           throw new CommentException("Cannot find comment");
       }
       this.commentRepository.delete(comment);
        return true;
    }

    @Override
    public CommentServiceModel editComment(CommentServiceModel commentServiceModel) throws CommentException {
        Comment comment = this.commentRepository.findById(commentServiceModel.getId()).orElse(null);
        if (comment == null){
            throw new CommentException("Cannot edit comment");
        }
        comment.setContent(commentServiceModel.getContent());
        comment.setUpdatedOn(LocalDateTime.now());
        this.commentRepository.saveAndFlush(comment);
        return this.modelMapper.map(comment, CommentServiceModel.class);
    }
}
