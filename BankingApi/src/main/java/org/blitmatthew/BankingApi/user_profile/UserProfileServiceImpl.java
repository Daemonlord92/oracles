package org.blitmatthew.BankingApi.user_profile;

import org.blitmatthew.BankingApi.entity.UserProfile;
import org.blitmatthew.BankingApi.shared.dto.PostUserInformation;
import org.blitmatthew.BankingApi.user_profile.dto.UpdateUserProfile;
import org.blitmatthew.BankingApi.user_profile.exception.UserProfileNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    protected final UserProfileRepository userProfileRepository;

    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public UserProfile createUserProfile(PostUserInformation postUserInformation) {
        UserProfile userProfile = new UserProfile();
        userProfile.setFirstName(postUserInformation.firstName());
        userProfile.setLastName(postUserInformation.lastName());
        userProfile.setAddress(postUserInformation.address());
        userProfile.setPhone(postUserInformation.phone());
        userProfile.setDob(LocalDate.parse(postUserInformation.dateOfBirth()));
        return userProfileRepository.save(userProfile);
    }

    @Override
    public void updateUserProfile(UpdateUserProfile updateUserProfile) {
        UserProfile userProfile = userProfileRepository.findById(updateUserProfile.id())
                .orElseThrow(() ->
                        new UserProfileNotFoundException(
                                "UserProfile with the id " +
                                        updateUserProfile.id() +
                                        " Not found!"));
        userProfile.setFirstName(updateUserProfile.firstName());
        userProfile.setLastName(updateUserProfile.lastName());
        userProfile.setAddress(updateUserProfile.address());
        userProfile.setPhone(updateUserProfile.phone());
        userProfileRepository.save(userProfile);
    }
}
