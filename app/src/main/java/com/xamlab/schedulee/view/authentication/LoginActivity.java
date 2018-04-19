package com.xamlab.schedulee.view.authentication;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xamlab.schedulee.R;
import com.xamlab.schedulee.databinding.ActivityLoginBinding;
import com.xamlab.schedulee.di.Injectable;
import com.xamlab.schedulee.viewModels.authentication.LoginViewModel;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements Injectable {

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    private ActivityLoginBinding binding;
    private LoginViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBindings();
    }

    private void initBindings() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel.class);
        binding.setViewModel(viewModel);
    }

}
