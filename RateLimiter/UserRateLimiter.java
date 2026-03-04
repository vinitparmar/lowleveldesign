package RateLimiter;

import java.util.concurrent.ConcurrentHashMap;

public class UserRateLimiter implements RateLimiter{

        private int capacity;
        private int refillRate;
        private ConcurrentHashMap<String,TokenBucket> buckets = new ConcurrentHashMap<>();

        public UserRateLimiter(int capacity , int refillRate){
            this.refillRate = refillRate;
            this.capacity = capacity;
        }


    @Override
    public boolean allowRequest(String userId) {

        buckets.putIfAbsent(userId, new TokenBucket(capacity, refillRate));

        return buckets.get(userId).allowRequest();
    }
    
}
