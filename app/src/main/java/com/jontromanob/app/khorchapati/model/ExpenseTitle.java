package com.jontromanob.app.khorchapati.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Hi on 3/15/2019.
 */
@Entity(tableName = "expense_title")

public class ExpenseTitle {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private Integer userId;
    @ColumnInfo(name = "expense_title")
    private String expenseTitle;
    @ColumnInfo(name = "created_at")
    private String createdAt;
    @ColumnInfo(name = "closed_at")
    private String closedAt;
    @ColumnInfo(name = "currently_running")
    private String currentlyRunning;
}
