package org.peimari.gleaflet.client.resources;

import com.google.gwt.core.client.GWT;

public class LeafletEditableResourceInjector {

	protected static LeafletEditableClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			LeafletResourceInjector.ensureInjected();
			bundle = GWT.create(LeafletEditableClientBundle.class);
			LeafletEditableResourceInjector injector = GWT
					.create(LeafletEditableResourceInjector.class);
			injector.injectResources();
		}
	}
	
	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		injectScript(bundle.editableScript().getText());
	}

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
