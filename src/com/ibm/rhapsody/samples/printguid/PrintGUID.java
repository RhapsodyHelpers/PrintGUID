package com.ibm.rhapsody.samples.printguid;

import com.telelogic.rhapsody.core.*;


public class PrintGUID {
	IRPApplication rpApp;
	IRPProject rpy;
	
	public PrintGUID(IRPApplication app ) {
		rpApp = app;
		rpy = rpApp.activeProject();
	}

	public void go(){
		IRPModelElement e = rpApp.getSelectedElement();
		if (e !=null){
			rpApp.writeToOutputWindow(null, e.getGUID() +"\n");
		}
	}

}
