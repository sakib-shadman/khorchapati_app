package com.jontromanob.app.khorchapati.db.dao;

import com.jontromanob.app.khorchapati.model.ExpenseTitle;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

/**
 * Created by Hi on 3/15/2019.
 */
@Dao
public interface ExpenseTitleDao {

    @Query("select * from expense_title")
    LiveData<List<ExpenseTitle>> getAllExpenseTitle();

    @Insert
    void addExpenseTitle(ExpenseTitle expenseTitle);
}
