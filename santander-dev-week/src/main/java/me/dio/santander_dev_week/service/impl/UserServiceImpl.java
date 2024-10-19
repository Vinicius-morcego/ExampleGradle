package me.dio.santander_dev_week.service.impl;

import me.dio.santander_dev_week.model.User;
import me.dio.santander_dev_week.repository.UserRepository;
import me.dio.santander_dev_week.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        boolean isValid = userRepository
                .existsByAccountNumber(userToCreate.getAccount().getNumber());
        if(isValid)
            throw  new IllegalArgumentException("This User ID already existis");
        return userRepository.save(userToCreate);
    }
}
