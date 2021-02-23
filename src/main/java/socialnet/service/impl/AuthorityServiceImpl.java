package socialnet.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import socialnet.models.entities.AuthorityEntity;
import socialnet.models.servicies.AuthorityServiceModel;
import socialnet.repository.AuthorityRepository;
import socialnet.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    private ModelMapper modelMapper;
    private AuthorityRepository authorityRepository;

    @Autowired
    public AuthorityServiceImpl(ModelMapper modelMapper, AuthorityRepository authorityRepository) {
        this.modelMapper = modelMapper;
        this.authorityRepository = authorityRepository;
    }

    public AuthorityServiceImpl() {
    }

    public AuthorityServiceModel findByName(String roleName) {
        AuthorityEntity authorityEntity = authorityRepository.getByRole(roleName);

        AuthorityServiceModel targetAuthority = authorityEntity == null ? null : modelMapper.map(
                authorityEntity, AuthorityServiceModel.class
        );

        return targetAuthority;
    }


}
