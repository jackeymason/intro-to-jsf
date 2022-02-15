/**
 * 
 */
package com.jtm.jsf.bean;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 * @author Jackey
 *
 */

@ViewScoped
@Named("fileUploadBean")
public class FileUploadPageBean implements Serializable {
	private Part uploadedFile;
	
	public Part getUploadedFile() {
		return uploadedFile;
	}
	
	public void setUploadedFile(Part uploadedFile) {
		this.uploadedFile = uploadedFile;
	}
	
	public void uploadFile() {
		Logger.getAnonymousLogger().info("Uploaded file mimetype " + uploadedFile.getContentType());
	}
}
