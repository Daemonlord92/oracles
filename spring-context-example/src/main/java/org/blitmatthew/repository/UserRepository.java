package org.blitmatthew.repository;

import org.springframework.stereotype.Repository;

// Indicates that this class is a Spring-managed repository bean
// This annotation is a specialization of @Component and is typically used for DAO (Data Access Object) classes
@Repository
public class UserRepository {

    // Simulates a method to find a user by their ID
    // This method currently throws a RuntimeException to indicate that it was invoked
    // In a real-world application, this method would interact with the database to fetch user details
    public int findById(long id) {
        // Simulate failure or proper method invocation
        throw new RuntimeException("its working properly");
    }
}
