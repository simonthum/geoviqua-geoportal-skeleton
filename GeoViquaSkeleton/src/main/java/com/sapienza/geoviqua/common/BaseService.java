package com.sapienza.geoviqua.common;

import java.io.OutputStream;

import org.dom4j.Document;

import com.sapienza.geoportal.chore.common.model.UserGlobalSearch;

/**
 *
 * @author kmadonna
 */
public abstract  class BaseService  {

    
	protected UserGlobalSearch userGlobalSearch;
	
    
	public UserGlobalSearch getUserGlobalSearch() {
		return userGlobalSearch;
	}
	public void setUserGlobalSearch(UserGlobalSearch userGlobalSearch) {
		this.userGlobalSearch = userGlobalSearch;
	}

        
}
