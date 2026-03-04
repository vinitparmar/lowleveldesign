package RateLimiter;

import java.util.concurrent.atomic.AtomicInteger;

public class TokenBucket {
    private final int capacity;
    private final int refillRate;
    private AtomicInteger tokens;
    private long lastRefillTimeStamp;

    public TokenBucket(int capacity , int refillRate){
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.tokens = new AtomicInteger(capacity);
        this.lastRefillTimeStamp = System.currentTimeMillis();

    }

    public synchronized boolean allowRequest(){
        
        refill();

        if(tokens.get() > 0){
            tokens.decrementAndGet();
            return true;
        }
        return false;
    }

    private void refill(){
        long now = System.currentTimeMillis();
        long elapsed = now - lastRefillTimeStamp;

        int tokenToAdd = (int)(elapsed/1000)*refillRate;

        if(tokenToAdd > 0){
            int newToken = Math.min(capacity, tokens.get() + tokenToAdd);

            tokens.set(newToken);

            lastRefillTimeStamp = now;
        }
    }
}
