package org.pre.payment.db.transactions;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Long, Transactions> {
}
