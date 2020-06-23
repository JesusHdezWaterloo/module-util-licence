package com.jhw.licence.core.main;

import com.google.inject.AbstractModule;
import com.jhw.licence.core.app.LicenceUseCase;
import com.jhw.licence.core.app.LicenceUseCaseImpl;

/**
 * Configuracion del injection del modulo de licencia-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class InjectionConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(LicenceUseCase.class).to(LicenceUseCaseImpl.class)/*.in(Singleton.class)*/;
    }

}
