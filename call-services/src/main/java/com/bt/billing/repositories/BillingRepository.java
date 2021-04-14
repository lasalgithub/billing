package com.bt.billing.repositories;

import com.bt.billing.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Bill, Long> {
}
