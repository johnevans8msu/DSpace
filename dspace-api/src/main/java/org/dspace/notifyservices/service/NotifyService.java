/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.notifyservices.service;

import java.sql.SQLException;
import java.util.List;

import org.dspace.core.Context;
import org.dspace.notifyservices.NotifyServiceEntity;

/**
 * Service interface class for the {@link NotifyServiceEntity} object.
 *
 * @author Mohamed Eskander (mohamed.eskander at 4science.com)
 */
public interface NotifyService {

    /**
     * find all notify service entities
     *
     * @param context the context
     * @return all notify service entities
     * @throws SQLException if database error
     */
    public List<NotifyServiceEntity> findAll(Context context) throws SQLException;

    /**
     * find one NotifyServiceEntity by id
     *
     * @param context the context
     * @param id the id of NotifyServiceEntity
     * @return the matched NotifyServiceEntity by id
     * @throws SQLException if database error
     */
    public NotifyServiceEntity find(Context context, Integer id) throws SQLException;

    /**
     * create new notifyServiceEntity
     *
     * @param context the context
     * @return the created NotifyServiceEntity
     * @throws SQLException if database error
     */
    public NotifyServiceEntity create(Context context) throws SQLException;

    /**
     * update the provided notifyServiceEntity
     *
     * @param context the context
     * @param notifyServiceEntity the notifyServiceEntity
     * @throws SQLException if database error
     */
    public void update(Context context, NotifyServiceEntity notifyServiceEntity) throws SQLException;

    /**
     * delete the provided notifyServiceEntity
     *
     * @param context the context
     * @param notifyServiceEntity the notifyServiceEntity
     * @throws SQLException if database error
     */
    public void delete(Context context, NotifyServiceEntity notifyServiceEntity) throws SQLException;

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
     * from its related notifyServiceInboundPatterns
     * also with 'automatic' equals to false
     *
     * @param context the context
     * @param pattern the ldnUrl
     * @return all NotifyServiceEntity matched the provided pattern
     * @throws SQLException if database error
     */
    public List<NotifyServiceEntity> findByPattern(Context context, String pattern) throws SQLException;
}
