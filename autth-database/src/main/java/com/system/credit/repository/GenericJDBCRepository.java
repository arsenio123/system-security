package com.system.credit.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

//@Component
@Transactional
public class GenericJDBCRepository<T>{
private Logger log=LoggerFactory.getLogger(GenericJDBCRepository.class);
@PersistenceContext
private EntityManager presisteEntity;
protected Class<T> type;


    public T saveUpdate(T transactional) {
        try{
        EntityManager storage= getEntityManager();
        //T t=
         //storage.persist(transactional);
         storage.merge(transactional);
         log.debug(transactional.toString());
        return transactional;
        }
        catch (Exception ex){
            log.error(ex.getMessage());
            throw ex;
        }
    }

    @Transactional
    public List<T> getAll(Object o) {
        try {
            List<T> list = (List<T>) presisteEntity.createQuery("from  "+o.getClass().getName(), o.getClass()).getResultList();
            return list;
        }catch (Exception ex){
            log.error(ex.getMessage());
            throw ex;
        }


    }

    public T findByID(T t){
        T found= (T) presisteEntity.find(type.getClass(),t);
        return found;
    }

    @Transactional
    public void saveAll(List<T> t){
        t.stream().forEach(element ->{
            try{
                presisteEntity.persist(element);
                //entityManager.merge(element);
            }catch (Exception ex){
                log.error("Cold not preciste Elemet, "+element);
                log.error("Error while precisting "+element,ex);
            }
        });
        //entityManager.close();

    }

    public EntityManager getEntityManager() {
        return presisteEntity;
    }
}
