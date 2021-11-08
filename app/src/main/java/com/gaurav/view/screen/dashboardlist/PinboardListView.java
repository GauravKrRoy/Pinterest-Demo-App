package com.gaurav.view.screen.dashboardlist;

import com.gaurav.model.Master_Details;
import com.gaurav.view.screen.common.CommonView;

import java.util.ArrayList;

/**
 * This interface is used for pinboard activities.
 *
 * @author SandeepD
 * @version 1.0
 */
interface PinboardListView extends CommonView
{

    void renderUserList(ArrayList<Master_Details> users);
}
