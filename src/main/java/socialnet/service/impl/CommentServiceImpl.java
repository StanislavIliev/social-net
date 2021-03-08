package socialnet.service.impl;

import org.springframework.stereotype.Service;

import socialnet.models.servicies.CommentServiceModel;
import socialnet.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
// TODO
    @Override
    public CommentServiceModel addComment(CommentServiceModel commentServiceModel) {
        return null;
    }

    @Override
    public boolean deleteComment(String id, String username) {
        return false;
    }

    @Override
    public CommentServiceModel editComment(CommentServiceModel commentServiceModel) {
        return null;
    }
}
