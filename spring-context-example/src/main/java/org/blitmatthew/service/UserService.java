package org.blitmatthew.service;

import org.blitmatthew.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Indicates that this class is a Spring-managed service bean
// This annotation is a specialization of @Component and is used to mark service layer classes
@Service
public class UserService {

    // Dependency: UserRepository is used by UserService for data access operations
    private UserRepository userRepository;

    // Constructor-based dependency injection
    // Spring automatically injects an instance of UserRepository into this class when creating the UserService bean
    @Autowired
    public UserService(UserRepository userRepository) {
        // Assigning the injected UserRepository instance to the private field
        this.userRepository = userRepository;
    }
}
