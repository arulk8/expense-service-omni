package com.arul.expense.service;

import com.arul.expense.dto.ExpenseDTO;

import java.util.List;

/**
 * Service interface for Expense Module
 * @author Arulmurugan K
 * */
public interface ExpenseService {
    /**
     * It will fetch all the expenses from JPA(database)
     * @author Arulmurgan K
     * */

    List<ExpenseDTO> getAllExpenses();
}
