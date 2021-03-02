package socialnet.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    /*public AuthorityServiceModel findByName(String roleName) {
//        Authority authority = authorityRepository.getByRole(roleName);

//        AuthorityServiceModel targetAuthority = authority == null ? null : modelMapper.map(authority, AuthorityServiceModel.class
        );

        return targetAuthority;
    }
*/

}
