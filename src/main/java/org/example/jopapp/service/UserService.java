package org.example.jopapp.service;


import org.example.jopapp.model.User;
import org.example.jopapp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public User save(User user) {

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepository.save(user);
    }
}
