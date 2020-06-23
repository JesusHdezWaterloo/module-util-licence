package com.jhw.licence.core.app;

import com.clean.core.app.repo.RWRepository;
import com.jhw.licence.core.domain.Licence;

/**
 * Interfaz de Repo para definir el trabajo de almacenamiento de la licencia.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public interface LicenceRepo extends RWRepository<Licence> {

    /**
     * Lee la licencia del fichero.
     *
     * @return la licencia leida
     * @throws Exception si hay algun problema leyendo la licencias
     */
    @Override
    public Licence read() throws Exception;

    /**
     * Guarda la licencia en el fichero
     *
     * @param lic Licencia a guardar
     * @throws Exception si hay algun problema guardando la licencias
     */
    @Override
    public void write(Licence lic) throws Exception;
}
