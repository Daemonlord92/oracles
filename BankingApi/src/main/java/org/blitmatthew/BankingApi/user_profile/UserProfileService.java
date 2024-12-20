package org.blitmatthew.BankingApi.user_profile;

import org.blitmatthew.BankingApi.entity.UserProfile;
import org.blitmatthew.BankingApi.shared.dto.PostUserInformation;
import org.blitmatthew.BankingApi.user_profile.dto.UpdateUserProfile;

public interface UserProfileService {
    UserProfile createUserProfile(PostUserInformation postUserInformation);
    void updateUserProfile(UpdateUserProfile updateUserProfile);
    UserProfile getUserProfileById(String id);
}
