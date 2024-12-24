package com.arul.expense.service;

import com.arul.expense.dto.ExpenseDTO;
import com.arul.expense.jpaEntity.ExpenseEntity;
import com.arul.expense.jpaRepository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService{
    private final ExpenseRepository expenseRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<ExpenseDTO> getAllExpenses() {
        // Call the repository method
        List<ExpenseEntity> list = expenseRepository.findAll();
        // Convert the Entity object to DTO object
        List<ExpenseDTO> listOfExpense = list.stream().map( expenseEntity -> mapEntityToDTO(expenseEntity)).collect(Collectors.toList());
        // Return the list
        return listOfExpense;
    }

    private ExpenseDTO mapEntityToDTO(ExpenseEntity e){
        return modelMapper.map(e, ExpenseDTO.class);
    }
}
