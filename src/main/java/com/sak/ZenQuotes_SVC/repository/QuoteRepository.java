package com.sak.ZenQuotes_SVC.repository;

import com.sak.ZenQuotes_SVC.Entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote,Long> {
}
