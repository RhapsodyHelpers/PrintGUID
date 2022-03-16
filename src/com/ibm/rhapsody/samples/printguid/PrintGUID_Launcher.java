package com.ibm.rhapsody.samples.printguid;
import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPProject;
import com.telelogic.rhapsody.core.RPUserPlugin;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

/**
 * This is a combined Plugin and Main
 * As such the helper may be launched in either mode by changing the HEP file
 * @author Andy Lapping
 */

public class PrintGUID_Launcher extends RPUserPlugin {

	static IRPApplication rpApp;
	static IRPProject rpy;
	static PrintGUID theApp;

	public static void main(String[] args) {
		rpApp = RhapsodyAppServer.getActiveRhapsodyApplication();
		rpy = rpApp.activeProject();
		theApp = new PrintGUID(rpApp);
		go();

	}
	
	public static void go(){
		theApp.go();
	}
	
	public void RhpPluginInit(IRPApplication rpyApplication) {
		PrintGUID_Launcher.rpApp = rpyApplication;
		theApp = new PrintGUID(rpApp);
		
	}

	public void OnMenuItemSelect(String menuItem) {
		//This method is called when the user invokes the helper from the right-click menu
		go();
	}
	
	public void RhpPluginInvokeItem() {
		//This method is called when the user invokes the helper from the tools menu
		go();
		
	}

	public void OnTrigger(String trigger) {
		//This method is called when the helper is invoked automatically by a trigger specified in the HEP file
		
	}

	public boolean RhpPluginCleanup() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void RhpPluginFinalCleanup() {
		// TODO Auto-generated method stub
		
	}



	
	


}
