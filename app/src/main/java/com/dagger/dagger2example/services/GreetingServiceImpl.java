package com.dagger.dagger2example.services;


public class GreetingServiceImpl implements GreetingsService {
    int value = 0;

    @Override
    public String getGreetLine(String name) {
        return "Hello " + name + " !!!";
    }

    @Override
    public void setMyVariableValue(int value) {
        this.value = value;
    }

    @Override
    public int getMyVariableValue() {
        return value;
    }
}
