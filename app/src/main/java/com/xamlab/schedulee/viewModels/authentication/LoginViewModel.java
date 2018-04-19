package com.xamlab.schedulee.viewModels.authentication;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

import com.xamlab.schedulee.core.services.IApiClient;

import javax.inject.Inject;

public class LoginViewModel extends ViewModel {
    private IApiClient mApiClient;
    public final ObservableField<String> email = new ObservableField<>();
    public final ObservableField<String> password = new ObservableField<>();

    @Inject
    public LoginViewModel(IApiClient apiClient)
    {
        mApiClient = apiClient;
        email.set(apiClient.Test());
    }

    public ObservableField<String> getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }


}
