package com.dagger.dagger2example.dependencties;

import com.dagger.dagger2example.activities.DashboardActivity;
import com.dagger.dagger2example.activities.MainActivity;
import com.dagger.dagger2example.application.DaggerApplication;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = ServiceModule.class)
public interface DaggerGraphComponents {
    void inject(MainActivity mainActivity);

    void inject(DashboardActivity dashboardActivity);


    final class Initializer {
        private Initializer() {

        }

        public static DaggerGraphComponents init(DaggerApplication app) {
            return DaggerDaggerGraphComponents
                    .builder()
                    .serviceModule(new ServiceModule())
                    .build();
        }
    }
}
