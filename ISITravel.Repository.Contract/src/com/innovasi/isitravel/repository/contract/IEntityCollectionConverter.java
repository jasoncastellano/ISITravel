package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.IDomainObject;
import org.odata4j.core.OEntity;

import java.util.List;


public interface IEntityCollectionConverter {
    public <T extends IDomainObject> List<T> ConvertEntityCollectionToDomainObjectCollection(List<OEntity> entities, IEntityConverter entityConverter);
}
