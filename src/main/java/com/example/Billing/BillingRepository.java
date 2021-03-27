package com.example.Billing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BillingRepository extends JpaRepository<Bill, Long> {
}
