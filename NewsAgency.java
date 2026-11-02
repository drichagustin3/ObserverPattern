import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String news);
}

class NewsAgency {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestNews;

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishNews(String news) {
        latestNews = news;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
}