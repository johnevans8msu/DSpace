/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.notifyservices.dao;

import java.sql.SQLException;
import java.util.List;

import org.dspace.core.Context;
import org.dspace.core.GenericDAO;
import org.dspace.notifyservices.NotifyServiceEntity;

/**
 * This is the Data Access Object for the {@link NotifyServiceEntity} object
 *
 * @author Mohamed Eskander (mohamed.eskander at 4science.com)
 */
public interface NotifyServiceDao extends GenericDAO<NotifyServiceEntity> {
    /**
     * find all NotifyServiceEntity matched the provided ldnUrl
     *
     * @param context the context
     * @param ldnUrl the ldnUrl
     * @return all NotifyServiceEntity matched the provided ldnUrl
     * @throws SQLException if database error
     */
    public List<NotifyServiceEntity> findByLdnUrl(Context context, String ldnUrl) throws SQLException;

    /**
     * find all NotifyServiceEntity matched the provided pattern
     * from the related notifyServiceInboundPatterns
     * also with 'automatic' equals to false
     *
     * @param context the context
     * @param pattern the ldnUrl
     * @return all NotifyServiceEntity matched the provided pattern
     * @throws SQLException if database error
     */
    public List<NotifyServiceEntity> findByPattern(Context context, String pattern) throws SQLException;
}
