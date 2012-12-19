package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.IDomainObject;
import org.odata4j.core.OEntity;

import java.util.List;

public interface IEntityConverter {
    public IDomainObject ConvertEntityToDomainObject(OEntity entity);

    public List<? extends IDomainObject> ConvertEntityCollectionToDomainObjectCollection(List<OEntity> entities);
}
