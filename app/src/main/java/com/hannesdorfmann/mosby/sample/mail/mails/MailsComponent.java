package com.hannesdorfmann.mosby.sample.mail.mails;

import com.hannesdorfmann.mosby.sample.mail.dagger.MailAppComponent;
import com.hannesdorfmann.mosby.sample.mail.dagger.MailModule;
import com.hannesdorfmann.mosby.sample.mail.dagger.NavigationModule;

import dagger.Component;

import javax.inject.Singleton;

/**
 * @author Hannes Dorfmann
 */
@Singleton
@Component(
        modules = {MailModule.class, NavigationModule.class},
        dependencies = MailAppComponent.class)
public interface MailsComponent {

    public MailsPresenter presenter();

    public void inject(MailsFragment fragment);
}
