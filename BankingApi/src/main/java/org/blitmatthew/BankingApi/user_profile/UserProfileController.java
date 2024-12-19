package org.blitmatthew.BankingApi.user_profile;

import org.blitmatthew.BankingApi.shared.dto.MessageResponse;
import org.blitmatthew.BankingApi.user_profile.dto.UpdateUserProfile;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user-profile")
public class UserProfileController {
    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PutMapping("/update")
    public ResponseEntity<MessageResponse> postUpdateProfile(@RequestBody UpdateUserProfile updateUserProfile) {
        try{
            userProfileService.updateUserProfile(updateUserProfile);
            return ResponseEntity.ok(new MessageResponse("User Profile has been updated!"));
        } catch (Exception e) {
            return new ResponseEntity<>(new MessageResponse(e.getMessage()),HttpStatus.BAD_REQUEST);
        }
    }
}
