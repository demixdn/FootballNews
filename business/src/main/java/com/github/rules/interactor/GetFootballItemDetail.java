package com.github.rules.interactor;

import com.github.rules.executor.UIScheduler;
import com.github.rules.executor.WorkerScheduler;
import com.github.rules.models.NewsItem;
import com.github.rules.repository.NewsRepository;
import com.google.common.base.Preconditions;

import io.reactivex.Observable;

/**
 * Date: 26.01.2017
 * Time: 15:49
 *
 * @author Aleks Sander
 *         Project FootballNews
 */

public class GetFootballItemDetail extends UseCase<NewsItem, GetFootballItemDetail.Params> {

    private final NewsRepository newsRepository;

    public GetFootballItemDetail(UIScheduler uiScheduler, WorkerScheduler workerScheduler, NewsRepository newsRepository) {
        super(uiScheduler, workerScheduler);
        Preconditions.checkNotNull(newsRepository);
        this.newsRepository = newsRepository;
    }

    @Override
    Observable<NewsItem> buildUseCaseObservable(Params params) {
        Preconditions.checkNotNull(params);
        return this.newsRepository.getNewsDetail(params.itemId);
    }

    public static final class Params {
        private final int itemId;

        private Params(int itemId) {
            this.itemId = itemId;
        }

        public static Params forItem(int itemId) {
            return new Params(itemId);
        }
    }
}
