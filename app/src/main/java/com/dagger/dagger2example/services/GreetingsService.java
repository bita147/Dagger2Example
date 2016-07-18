package com.dagger.dagger2example.services;


public interface GreetingsService {
    public String getGreetLine(String name);

    public void setMyVariableValue(int value);

    public int getMyVariableValue();
}
