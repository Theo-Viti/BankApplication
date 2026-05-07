package com.example.cards.controller;



import com.example.cards.model.Card;
import com.example.cards.model.Customer;
import com.example.cards.repository.CardRepository;
import com.example.cards.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CardController {

      @Autowired
      private CardRepository cardsRepository;
      private CardService cardService;

      @PostMapping("/myCards")
      public List<Card> getCardDetails(@RequestBody Customer customer) {
            List<Card> cards = cardsRepository.findByCustomerId(customer.getCustomerID());
            if (cards != null) {
                  return cards;
            } else {
                  return null;
            }
      }

      @GetMapping("/myCard/{customerId}")
      public List<javax.smartcardio.Card> getCardDetails(@PathVariable Long customerId) {
            List<javax.smartcardio.Card> card = cardService.getAllByCustomerId(customerId);
            if (card != null) {
                  return card;
            }
            return null;
      }

}