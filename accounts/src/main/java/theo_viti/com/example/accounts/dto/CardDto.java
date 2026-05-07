package theo_viti.com.example.accounts.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CardDto {
      private Integer cardId;
      private Integer customerId;

      private String cardNumber;
      private String cardType;

      private Integer totalLimit;
      private Integer amountUsed;
      private Integer availableAmount;

      private LocalDate creadteDt;
}
