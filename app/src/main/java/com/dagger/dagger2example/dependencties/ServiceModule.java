package com.dagger.dagger2example.dependencties;

import com.dagger.dagger2example.services.GreetingServiceImpl;
import com.dagger.dagger2example.services.GreetingsService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides
    @Singleton
    GreetingsService getGreetingService(){
        return  new GreetingServiceImpl();
    }
}
