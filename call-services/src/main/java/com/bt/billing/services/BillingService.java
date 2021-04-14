package com.bt.billing.services;

import com.bt.billing.models.*;
import com.bt.billing.repositories.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    private final BillingRepository repository;

    public BillingService(BillingRepository repository) {
        this.repository = repository;
    }

    public List<Bill> GetAllBills(){
        return repository.findAll();
    }

    public Bill UpsertBill(Bill upsertingBill){
        return repository.save(upsertingBill);
    }

    public Bill GetBill(Long id){
        return repository.findById(id).orElse(null);
    }

    public void DeleteBill(Long id){
        repository.deleteById(id);
    }
}

