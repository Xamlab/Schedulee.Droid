package com.xamlab.schedulee.core.services.implementation;

import com.xamlab.schedulee.core.services.IApiClient;

public class FirebaseApiClient implements IApiClient {
    @Override
    public String Test() {
        return "Test!!!";
    }
}
