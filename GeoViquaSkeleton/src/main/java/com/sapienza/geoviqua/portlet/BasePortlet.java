package com.sapienza.geoviqua.portlet;


import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * 
 * @author kmadonna
 *
 */
public class BasePortlet extends GenericPortlet {

	public void init() throws PortletException {
		editJSP = getInitParameter("edit-jsp");
		helpJSP = getInitParameter("help-jsp");
		viewJSP = getInitParameter("view-jsp");
	}

	public void doDispatch(RenderRequest req, RenderResponse res)
		throws IOException, PortletException {

		String jspPage = req.getParameter("jspPage");

		if (jspPage != null) {
			include(jspPage, req, res);
		}
		else {
			super.doDispatch(req, res);
		}
	}

	public void doEdit(RenderRequest req, RenderResponse res)
		throws IOException, PortletException {

		if (req.getPreferences() == null) {
			super.doEdit(req, res);
		}
		else {
			include(editJSP, req, res);
		}
	}

	public void doHelp(RenderRequest req, RenderResponse res)
		throws IOException, PortletException {

		include(helpJSP, req, res);
	}

	public void doView(RenderRequest req, RenderResponse res)
		throws IOException, PortletException {
		    
		include(viewJSP, req, res);
	}
	    
    
	public void processAction(ActionRequest req, ActionResponse res)
		throws IOException, PortletException {
	}

	protected void include(String path, RenderRequest req, RenderResponse res)
		throws IOException, PortletException {

		PortletRequestDispatcher prd =
			getPortletContext().getRequestDispatcher(path);

		if (prd == null) {
			_log.error(path + " is not a valid include");
		}
		else {
			prd.include(req, res);
		}
	}

	protected String getFullXslPath(RenderRequest req, String xslFile){
		String path = "http://"+req.getServerName()+":"+req.getServerPort()+ req.getContextPath() + xslFile;
		return path;
	}
	
	protected String editJSP;
	protected String helpJSP;
	protected String viewJSP;

	private static Log _log = LogFactory.getLog(BasePortlet.class);

}