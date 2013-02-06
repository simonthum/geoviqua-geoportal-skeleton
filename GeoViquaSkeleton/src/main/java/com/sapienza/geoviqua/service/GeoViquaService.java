package com.sapienza.geoviqua.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import com.sapienza.geoviqua.common.BaseService;
import com.sapienza.geoviqua.portlet.GeoViquaExamplePortlet;
import com.sapienza.geoportal.chore.common.model.UserGlobalSearch;
import com.sapienza.geoportal.chore.common.search.SearchRemote;

/**
 *
 * @author kmadonna
 */
public class GeoViquaService extends BaseService {	
    public Document retrieveDocument(String[] uuid){
    	// Using the geoportal-chore to access EGB and stream results
    	setUserGlobalSearch(new UserGlobalSearch());
        Document xmlDoc = new SearchRemote(getUserGlobalSearch()).getResources(uuid);
        return xmlDoc;
    }
       
    private static Log _log = LogFactory.getLog(GeoViquaExamplePortlet.class);
}
