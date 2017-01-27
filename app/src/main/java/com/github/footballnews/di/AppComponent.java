package com.github.footballnews.di;

import com.github.footballnews.ui.StartActivity;

/**
 * Date: 27.01.2017
 * Time: 17:42
 *
 * @author Aleks Sander
 *         Project FootballNews
 */

public interface AppComponent extends Component{

    void inject(StartActivity activity);
}