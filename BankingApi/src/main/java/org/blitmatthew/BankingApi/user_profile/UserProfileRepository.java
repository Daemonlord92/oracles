package org.blitmatthew.BankingApi.user_profile;

import org.blitmatthew.BankingApi.entity.UserProfile;
import org.springframework.data.repository.ListCrudRepository;

public interface UserProfileRepository extends ListCrudRepository<UserProfile, String> {
}
