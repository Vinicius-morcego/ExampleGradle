package me.dio.santander_dev_week.service;

import me.dio.santander_dev_week.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User saveUser(User user);
    User updateUser(Long id, User user);
    Iterable<User> users(User user);
    User userById(Long id);
    void delete(Long id);
}
