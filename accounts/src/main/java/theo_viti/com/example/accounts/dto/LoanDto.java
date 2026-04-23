package theo_viti.com.example.accounts.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LoanDto {
      private Integer loanNumber;
      private Integer customerId;
      private Date startDt;
      private String loanType;
      private Integer totalLoan;
      private Integer amountPaid;
      private Integer outstandingAmount;
      private String createDt;
}
