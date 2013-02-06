
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"
    xmlns:gmi="http://www.isotc211.org/2005/gmi"
    xmlns:csw="http://www.opengis.net/cat/csw/2.0.2" xmlns:dc="http://purl.org/dc/elements/1.1/"
    xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:gmd="http://www.isotc211.org/2005/gmd"
    xmlns:srv="http://www.isotc211.org/2005/srv"
    xmlns:apiso="http://www.opengis.net/cat/csw/apiso/1.0"
    xmlns:gsr="http://www.isotc211.org/2005/gsr"
    xmlns:msg="http://imaa.cnr.it/sdi/services/7.0/messages/schema"
    xmlns:gts="http://www.isotc211.org/2005/gts"
    xmlns:rim="urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0"
    xmlns:gmx="http://www.isotc211.org/2005/gmx"
    xmlns:dm6="http://imaa.cnr.it/sdi/services/6.1/dataModel/schema"
    xmlns:wrs="http://www.opengis.net/cat/wrs/1.0" xmlns:ogc="http://www.opengis.net/ogc"
    xmlns:dct="http://purl.org/dc/terms/" xmlns:ows="http://www.opengis.net/ows"
    xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:gml="http://www.opengis.net/gml"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<xsl:output method="html" indent="yes" encoding="UTF-8"/>

		
    <xsl:template match="gmd:MD_Metadata" name="table">
	<body>
		<table style="color:#000000">
	        <tbody>
				<tr>
	            	<td width="100px">
		                File identifier
					</td>
					<td style="font-weight:normal">
						<xsl:value-of select="gmd:fileIdentifier"/>
	                </td>
	            </tr>   

				<tr>
	            	<td >
		             &#160;
					</td>
					<td >
						&#160;
	                </td>
	            </tr> 				
				<tr>
					<td valign="top">
						Description
					</td>
					<td style="font-weight:normal">
						 <xsl:value-of select="gmd:identificationInfo/*/gmd:abstract/gco:CharacterString" disable-output-escaping="yes" />
					</td>
				
				</tr>
				
				
			</tbody>  
		</table>
		</body>
	  </xsl:template>
	  
	  
</xsl:stylesheet>
