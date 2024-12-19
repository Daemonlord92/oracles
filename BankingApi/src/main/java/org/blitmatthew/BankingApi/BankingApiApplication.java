package org.blitmatthew.BankingApi;

import org.blitmatthew.BankingApi.shared.dto.PostUserInformation;
import org.blitmatthew.BankingApi.user_profile.UserProfileService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApiApplication implements CommandLineRunner {

	private final UserProfileService userProfileService;

	public BankingApiApplication(UserProfileService userProfileService) {
		this.userProfileService = userProfileService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BankingApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PostUserInformation postUserInformation = new PostUserInformation(
				"Fawad",
				"Shaikh",
				"test@test.com",
				"test@123",
				"123 String St",
				9072728359l,
				"1998-10-11"
		);
		userProfileService.createUserProfile(postUserInformation);
	}
}
