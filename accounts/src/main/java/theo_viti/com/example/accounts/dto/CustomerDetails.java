package theo_viti.com.example.accounts.dto;

import lombok.Data;
import theo_viti.com.example.accounts.model.Accounts;

import java.util.List;

@Data
public class CustomerDetails {
      private Accounts accounts;
      private List<LoanDto> loanDto;
      private List<CardDto> cardDto;

}
