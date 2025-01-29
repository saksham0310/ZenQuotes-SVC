package com.sak.ZenQuotes_SVC.Controller;

import com.sak.ZenQuotes_SVC.Entity.Quote;
import com.sak.ZenQuotes_SVC.Entity.User;
import com.sak.ZenQuotes_SVC.Service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/quote")
public class QuoteController {

    @Autowired
    QuoteService quoteService;

    @GetMapping("all")
    public List<Quote> allQuote() {
        return this.quoteService.getAllQuote();
    }

    @PostMapping("upload")
    public void uploadQuote(@RequestBody Quote quote)
    {
        this.quoteService.uploadQuote(quote);
    }

}
