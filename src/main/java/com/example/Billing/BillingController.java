package com.example.Billing;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class BillingController {


    private final BillingService billingService;

    BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @GetMapping("/bills")
    public List<Bill> GetBills() {
        return billingService.GetAllBills();
    }

    @GetMapping("/bills/{id}")
    public Bill GetBill(@PathVariable Long id) {
        return billingService.GetBill(id);
    }

    @PostMapping("/bills")
    public Bill UpsertBill(@RequestBody BillingRequest request) {
        return billingService.UpsertBill(new Bill(request.Id, request.name, request.amount));
    }

    @DeleteMapping ("/bills/{id}")
    public void DeleteBill(@PathVariable Long id) {
        billingService.DeleteBill(id);
    }

}
