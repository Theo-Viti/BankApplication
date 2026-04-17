package theo_viti.com.example.accounts.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import theo_viti.com.example.accounts.model.Accounts;
import theo_viti.com.example.accounts.model.Customer;
import theo_viti.com.example.accounts.repository.AccountsRepository;

@RestController
public class AccountsController {

      @Autowired
      private AccountsRepository accountsRepository;

      @PostMapping("/myAccount")
      public Accounts getAccountDetails(@RequestBody Customer customer) {


            Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
            if (accounts != null) {
                  return accounts;
            } else {
                  return null;

            }
      }
}