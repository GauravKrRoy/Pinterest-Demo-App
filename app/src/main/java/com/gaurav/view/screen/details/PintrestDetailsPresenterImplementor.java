package com.gaurav.view.screen.details;

import android.annotation.SuppressLint;

import com.gaurav.model.Details_Category;
import com.gaurav.model.Master_Details;

import java.util.List;

/**
 * Pin details presenter implementation.
 * @author Sandeep D
 *
 */
class PintrestDetailsPresenterImplementor implements PinDetailsPresenter
{
	private PinDetailsView detailsView;
	
	PintrestDetailsPresenterImplementor(PinDetailsView detailsView)
	{
		this.detailsView = detailsView;
	}
	
	@Override
	public void renderDetails(Master_Details currentData)
	{
		if (detailsView != null)
		{
			if (currentData != null)
			{
				detailsView.renderPhoto(currentData.getUrlDetails().getFull());
				detailsView.setBackgroundColor(currentData.getColor());
				detailsView.renderUserDetails(currentData.getUser());
				detailsView.renderPhotoDetails(currentData);
				detailsView.renderCategories(getDisplayCategories(currentData.getCategories()));
			}
		}
	}
	
	@SuppressLint("DefaultLocale")
	private String getDisplayCategories(List<Details_Category> categories)
	{
		String displayCategories = "";
		for (Details_Category categoriesDetailsResponse :
				categories)
		{
			if (displayCategories.trim().equals(""))
			{
				displayCategories = String.format("%s (%d)", categoriesDetailsResponse.getTitle(), categoriesDetailsResponse.getPhotoCount());
			}
			else
			{
				displayCategories = String.format("%s/%s", displayCategories, String.format("%s (%d)", categoriesDetailsResponse.getTitle(), categoriesDetailsResponse.getPhotoCount()));
			}
		}
		return displayCategories;
	}
}
