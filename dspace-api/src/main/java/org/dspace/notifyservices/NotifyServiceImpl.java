/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.notifyservices;

import java.sql.SQLException;
import java.util.List;

import org.dspace.core.Context;
import org.dspace.notifyservices.dao.NotifyServiceDao;
import org.dspace.notifyservices.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementation of {@link NotifyService}.
 *
 * @author Mohamed Eskander (mohamed.eskander at 4science.com)
 */
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private NotifyServiceDao notifyServiceDao;

    @Override
    public List<NotifyServiceEntity> findAll(Context context) throws SQLException {
        return notifyServiceDao.findAll(context, NotifyServiceEntity.class);
    }

    @Override
    public NotifyServiceEntity find(Context context, Integer id) throws SQLException {
        return notifyServiceDao.findByID(context, NotifyServiceEntity.class, id);
    }

    @Override
    public NotifyServiceEntity create(Context context) throws SQLException {
        NotifyServiceEntity notifyServiceEntity = new NotifyServiceEntity();
        return notifyServiceDao.create(context, notifyServiceEntity);
    }

    @Override
    public void update(Context context, NotifyServiceEntity notifyServiceEntity) throws SQLException {
        notifyServiceDao.save(context, notifyServiceEntity);
    }

    @Override
    public void delete(Context context, NotifyServiceEntity notifyServiceEntity) throws SQLException {
        notifyServiceDao.delete(context, notifyServiceEntity);
    }

    @Override
    public List<NotifyServiceEntity> findByLdnUrl(Context context, String ldnUrl) throws SQLException {
        return notifyServiceDao.findByLdnUrl(context, ldnUrl);
    }

    @Override
    public List<NotifyServiceEntity> findByPattern(Context context, String pattern) throws SQLException {
        return notifyServiceDao.findByPattern(context, pattern);
    }

}
