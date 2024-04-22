package it.pi.registro.registro.service;

import it.pi.registro.registro.entity.User;
import it.pi.registro.registro.entity.UserType;
import it.pi.registro.registro.repository.UserRepository;
import it.pi.registro.registro.repository.UserTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceTypeImpl implements UserTypeService{

    private UserTypeRepository userTypeRepository;


    @Override
    public UserType createUserType(UserType userType) {
        return null;
    }

    @Override
    public UserType getUserTypeById(Long userTypeId) {
        return null;
    }

    @Override
    public List<UserType> getAllUsersType() {
        return List.of();
    }

    @Override
    public UserType updateUser(UserType userType) {
        return null;
    }

    @Override
    public void deleteUserType(Long userId) {

    }
}
