package com.example.cards.service;

import com.example.cards.dto.CardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CardService {



      @GetMapping("/myCard/{customerId}")
      public List<CardDto> getCardDetails(@PathVariable Long customerId) {
            return cardService.getAllByCustomerId(customerId);
      }


}
