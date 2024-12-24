package com.arul.expense.service;

import com.arul.expense.dto.ExpenseDTO;

import java.util.List;

public interface ExpenseService {

    List<ExpenseDTO> getAllExpenses();
}
