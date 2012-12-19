package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.IDomainObject;
import com.innovasi.isitravel.repository.contract.IEntityCollectionConverter;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.odata4j.core.OEntity;

import java.util.ArrayList;
import java.util.List;


public class EntityCollectionConverter implements IEntityCollectionConverter {

    @SuppressWarnings(value="unchecked")
    public <T extends IDomainObject> List<T> ConvertEntityCollectionToDomainObjectCollection(List<OEntity> entities, IEntityConverter entityConverter)
    {
        List<T> list = new ArrayList<T>();
        if(entities != null) {
            for(OEntity entity : entities) {
                list.add((T)entityConverter.ConvertEntityToDomainObject(entity));
            }
        }
        return list;
    }
}
