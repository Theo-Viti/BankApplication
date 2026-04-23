package theo_viti.com.example.accounts.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import theo_viti.com.example.accounts.dto.LoanDto;

import java.util.List;

@FeignClient("loans")
public interface LoansFeignClient {
      @GetMapping("/myLoans/{customerId}")
      List<LoanDto> getLoansDetails(@PathVariable long customerId);
}
