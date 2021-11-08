package com.gaurav.loader.callback;

import com.gaurav.loader.models.ServiceContentTypeDownload;

public interface ContentServiceStatusObserver
{
	void setDone(ServiceContentTypeDownload serviceContentTypeDownload);
	
	void setCancelled(ServiceContentTypeDownload serviceContentTypeDownload);
	
	void onFailure(ServiceContentTypeDownload serviceContentTypeDownload);
}
