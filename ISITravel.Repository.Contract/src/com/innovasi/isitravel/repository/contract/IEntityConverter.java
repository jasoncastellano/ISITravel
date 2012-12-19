package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.IDomainObject;
import org.odata4j.core.OEntity;


public interface IEntityConverter {
    public IDomainObject ConvertEntityToDomainObject(OEntity entity);
}
