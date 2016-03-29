package com.blogspot.e_kanivets.moneytracker.di;

import com.blogspot.e_kanivets.moneytracker.activity.ExportActivity;
import com.blogspot.e_kanivets.moneytracker.activity.ReportActivity;
import com.blogspot.e_kanivets.moneytracker.activity.SettingsActivity;
import com.blogspot.e_kanivets.moneytracker.activity.account.AccountsActivity;
import com.blogspot.e_kanivets.moneytracker.activity.account.AddAccountActivity;
import com.blogspot.e_kanivets.moneytracker.activity.account.TransferActivity;
import com.blogspot.e_kanivets.moneytracker.activity.exchange_rate.AddExchangeRateActivity;
import com.blogspot.e_kanivets.moneytracker.activity.exchange_rate.ExchangeRatesActivity;
import com.blogspot.e_kanivets.moneytracker.activity.record.AddRecordActivity;
import com.blogspot.e_kanivets.moneytracker.activity.record.MainActivity;
import com.blogspot.e_kanivets.moneytracker.di.module.ControllerModule;
import com.blogspot.e_kanivets.moneytracker.di.module.RepoModule;
import com.blogspot.e_kanivets.moneytracker.ui.AccountsSummaryPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Dagger 2 component.
 * Created on 3/29/16.
 *
 * @author Evgenii Kanivets
 */
@Component(modules = {RepoModule.class, ControllerModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);

    void inject(AddRecordActivity addRecordActivity);

    void inject(ExchangeRatesActivity exchangeRatesActivity);

    void inject(AddExchangeRateActivity exchangeRateActivity);

    void inject(AccountsActivity accountsActivity);

    void inject(AddAccountActivity addAccountActivity);

    void inject(TransferActivity transferActivity);

    void inject(ExportActivity exportActivity);

    void inject(ReportActivity reportActivity);

    void inject(SettingsActivity.SettingsFragment settingsFragment);

    void inject(AccountsSummaryPresenter accountsSummaryPresenter);
}
