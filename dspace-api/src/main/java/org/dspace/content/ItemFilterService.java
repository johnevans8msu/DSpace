/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.content;

import java.util.List;

import org.dspace.notifyservices.ItemFilter;

/**
 * Service interface class for the Item Filter Object
 *
 * @author Mohamed Eskander (mohamed.eskander at 4science.com)
 */
public interface ItemFilterService {

    /**
     * @return all logical item filters
     * defined in item-filter.xml
     */
    public List<ItemFilter> findAll();
}
