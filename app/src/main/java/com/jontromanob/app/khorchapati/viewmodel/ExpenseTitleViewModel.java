package com.jontromanob.app.khorchapati.viewmodel;

import android.os.AsyncTask;

import com.jontromanob.app.khorchapati.db.AppDatabase;
import com.jontromanob.app.khorchapati.model.ExpenseTitle;

import androidx.lifecycle.ViewModel;

/**
 * Created by Hi on 3/15/2019.
 */

public class ExpenseTitleViewModel extends ViewModel {

    AppDatabase appDatabase;
    private ExpenseTitle expenseTitle;

    public ExpenseTitleViewModel(ExpenseTitle expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public void addExpenseTitle(ExpenseTitle expenseTitle){
         new insertExpenseTitle().execute ();
    }
    private class insertExpenseTitle extends AsyncTask<Void, Void, Void> {


        @Override
        protected void onPreExecute() {

            super.onPreExecute ();
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute (result);
        }

        @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

    }

}
