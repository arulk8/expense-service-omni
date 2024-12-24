package com.arul.expense.service;

import com.arul.expense.dto.ExpenseDTO;
import com.arul.expense.jpaEntity.ExpenseEntity;
import com.arul.expense.jpaRepository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service implementation for Expense Module
 * @author Arulmurugan K
 * */
@Service
@RequiredArgsConstructor
@Slf4j
public class ExpenseServiceImpl implements ExpenseService{
    private final ExpenseRepository expenseRepository;
    private final ModelMapper modelMapper;

    /**
     * It will fetch all the expenses from JPA(database)
     * @author Arulmurgan K
     * */
    @Override
    public List<ExpenseDTO> getAllExpenses() {
        // Call the repository method
        List<ExpenseEntity> list = expenseRepository.findAll();
        log.info("Printing the data from repository {}", list);
        // Convert the Entity object to DTO object
        List<ExpenseDTO> listOfExpense = list.stream().map( expenseEntity -> mapEntityToDTO(expenseEntity)).collect(Collectors.toList());
        // Return the list
        return listOfExpense;
    }

    /**
     * Mapper method to convert expense entity to expense DTO
     * @param expenseEntity
     * @return ExpenseDTO
     **/
    private ExpenseDTO mapEntityToDTO(ExpenseEntity e){
        return modelMapper.map(e, ExpenseDTO.class);
    }
}
