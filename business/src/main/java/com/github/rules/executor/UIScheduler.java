package com.github.rules.executor;

import io.reactivex.Scheduler;

/**
 * Date: 26.01.2017
 * Time: 12:43
 *
 * @author Aleks Sander
 *         Project FootballNews
 */
public interface UIScheduler {
    Scheduler getScheduler();
}
