package theo_viti.com.example.accounts.controller;
import org.springframework.web.bind.annotation.*;
import theo_viti.com.example.accounts.client.CardFeignClient;
import theo_viti.com.example.accounts.client.LoansFeignClient;
import theo_viti.com.example.accounts.dto.CardDto;
import theo_viti.com.example.accounts.dto.CustomerDetails;
import theo_viti.com.example.accounts.dto.LoanDto;
import theo_viti.com.example.accounts.model.Accounts;
import theo_viti.com.example.accounts.model.Customer;
import theo_viti.com.example.accounts.repository.AccountsRepository;

import java.util.List;


@RestController
public class      AccountsController {

      //Injection de Bean via private final. @Autowired = déprécié
      //@AllArgsConstructor
      private final AccountsRepository accountsRepository;
      private final LoansFeignClient loansFeignClient;
      private final CardFeignClient cardFeignClient;


      public AccountsController(AccountsRepository accountsRepository, LoansFeignClient loansFeignClient, CardFeignClient cardFeignClient) {
            this.accountsRepository = accountsRepository;
            this.loansFeignClient = loansFeignClient;
            this.cardFeignClient = cardFeignClient;
      }

      @PostMapping("/myAccount")
      public Accounts getAccountDetails(@RequestBody Customer customer) {
            Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
            if (accounts != null) {
                  return accounts;
            } else {
                  return null;

            }
      }

      @GetMapping("/myCustomerDetails/{id}")
      public CustomerDetails myCustomerDetails(@PathVariable Long id){
            Accounts accounts = accountsRepository.findByCustomerId(id);
            List<LoanDto> loans = loansFeignClient.getLoansDetails(id);
            List<CardDto> cards = cardFeignClient.getCardDetails(id     );

            CustomerDetails customerDetails = new CustomerDetails();
            customerDetails.setAccounts(accounts);
            customerDetails.setLoanDto(loans);
            customerDetails.setCardDto(cards);

            return customerDetails;
      }
}