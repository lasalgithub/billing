package com.example.Billing;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    private final BillingRepository repository;

    public BillingService(BillingRepository repository) {
        this.repository = repository;
    }

    List<Bill> GetAllBills(){
        return repository.findAll();
    }

    Bill UpsertBill(Bill upsertingBill){
        return repository.save(upsertingBill);
    }

    Bill GetBill(Long id){
        return repository.findById(id).orElse(null);
    }

    void DeleteBill(Long id){
        repository.deleteById(id);
    }
}
