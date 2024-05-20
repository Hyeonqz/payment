package org.pre.payment.db.prepayment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrePaymentRepository extends JpaRepository<Long, PrePayment> {
}
