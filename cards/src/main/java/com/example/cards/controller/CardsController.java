package com.example.cards.controller;



import com.example.cards.model.Cards;
import com.example.cards.model.Customer;
import com.example.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CardsController {

      @Autowired
      private CardsRepository cardsRepository;

      @PostMapping("/myCards")
      public List<Cards> getCardDetails(@RequestBody Customer customer) {
            List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerID());
            if (cards != null) {
                  return cards;
            } else {
                  return null;
            }
      }

}