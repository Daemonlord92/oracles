package org.blitmatthew.BankingApi.accounts;

import org.blitmatthew.BankingApi.accounts.dto.AccountInformation;
import org.blitmatthew.BankingApi.accounts.dto.PostNewAccountInformation;
import org.blitmatthew.BankingApi.shared.dto.IdDto;
import org.blitmatthew.BankingApi.shared.dto.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/")
    public ResponseEntity<MessageResponse> postNewAccount(
            @RequestBody PostNewAccountInformation postNewAccountInformation
    ) {
        return new ResponseEntity<>(accountService.createAccount(postNewAccountInformation), HttpStatus.CREATED);
    }

    //We can either pass in a ParamVariable, or we can send in a request body
    @GetMapping("/")
    public ResponseEntity<AccountInformation> getAccountById(@RequestBody IdDto idDto) {
        return new ResponseEntity<>(accountService.getAccountById(idDto.id()), HttpStatus.OK);
    }
}
