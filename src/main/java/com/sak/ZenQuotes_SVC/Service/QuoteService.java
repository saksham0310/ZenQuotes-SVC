package com.sak.ZenQuotes_SVC.Service;

import com.sak.ZenQuotes_SVC.Entity.Quote;
import com.sak.ZenQuotes_SVC.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {

    @Autowired
    QuoteRepository quoteRepository;

     public List<Quote> getAllQuote() {
        return this.quoteRepository.findAll();
     }

     public void uploadQuote(Quote quote)
     {
         this.quoteRepository.save(quote);
     }

}
