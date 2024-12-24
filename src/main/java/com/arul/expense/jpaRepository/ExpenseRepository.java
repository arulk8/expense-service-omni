package com.arul.expense.jpaRepository;

import com.arul.expense.jpaEntity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {
}
