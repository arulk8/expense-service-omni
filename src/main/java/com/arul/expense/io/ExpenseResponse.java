package com.arul.expense.io;
import lombok.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Builder
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseResponse {
    private String expenseId;
    private String name;
    private String note;
    private String category;
    private Date date;
    private BigDecimal amount;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
