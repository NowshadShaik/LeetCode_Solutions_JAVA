package Solutions;

import java.util.*;

public class _0355_Design_Twitter {

    int serial;
    Map<Integer, Set<Integer>> users;
    Map<Integer, List<int[]>> tweets;

    public _0355_Design_Twitter() {
        this.serial = 0;
        this.users = new HashMap<>();
        this.tweets = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        tweets.computeIfAbsent(userId, k -> new ArrayList<>()).add(new int[] {serial--, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        users.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);
        for(int user : users.get(userId)) {
            if(tweets.containsKey(user)) {
                List<int[]> userTweets = tweets.get(user);
                int index = userTweets.size()-1;
                int[] lastTweet = userTweets.get(index);
                minHeap.offer(new int[] {lastTweet[0], lastTweet[1], user, index});
            }
        }

        while(!minHeap.isEmpty() && res.size() < 10) {
            int[] curr = minHeap.poll();
            res.add(curr[1]);

            int index = curr[3];
            if(index > 0) {
                int[] tweet = tweets.get(curr[2]).get(index-1);
                minHeap.offer(new int[] {tweet[0], tweet[1], curr[2], index-1});
            }
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        users.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        users.computeIfPresent(followerId, (k, v) -> {
            v.remove(followeeId);
            return v;
        });
    }
}
