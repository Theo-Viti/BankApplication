package theo_viti.com.example.accounts.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import theo_viti.com.example.accounts.dto.CardDto;

import java.util.List;

@FeignClient("cards")
public interface CardFeignClient {
      @GetMapping("/myCard/{customerId}")
      List<CardDto> getCardDetails(@PathVariable long customerId);
}