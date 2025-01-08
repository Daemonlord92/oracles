package org.blitmatthew.BankingApi.transactions;

import org.blitmatthew.BankingApi.shared.dto.MessageResponse;
import org.blitmatthew.BankingApi.transactions.dto.PostNewTransaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

//Controller
//it is made to return HTML/CSS/JavaScript
//RestController
//ResponseBody
// Expects to return JSON/Protobuf/XML
@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @PostMapping("/")
    public ResponseEntity<MessageResponse> postNewTransaction (@RequestBody PostNewTransaction postNewTransaction){
        return ResponseEntity
                .created(
                        URI
                        .create("/api/v1/transaction/")
                )
                .body(transactionService
                        .createTransaction(postNewTransaction)
                );
    }
}
