package com.sf.gandalf.designs.ratelimiter;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Design a Rate Limiter that
 * - Restrict the number of Request a client can make in a given window.
 * - Prevent Abuse
 * - Work effectively at scale ( millions of users)
 */
public class TokenBucketRateLimiter {

    private final long capacity;
    private final double refillRatePerMillis;
    private double currentTokens;
    private long lastRefillTimestamp;

    private final ReentrantLock lock = new ReentrantLock();

    public TokenBucketRateLimiter(long capacity, long refillPerSecond) {
        this.capacity = capacity;
        this.refillRatePerMillis = refillPerSecond / 1000.0;
        this.currentTokens = capacity;
        this.lastRefillTimestamp = System.currentTimeMillis();
    }

    private void refill() {
        long now = System.currentTimeMillis();
        long elapsed = now - lastRefillTimestamp;

        double tokensToAdd = elapsed * refillRatePerMillis;

        if (tokensToAdd > 0) {
            currentTokens = Math.min(capacity, currentTokens + tokensToAdd);
            lastRefillTimestamp = now;
        }
    }

    public boolean allowRequest() {
        lock.lock();
        try {
            refill();

            if (currentTokens >= 1) {
                currentTokens -= 1;
                return true;
            }

            return false;
        } finally {
            lock.unlock();
        }
    }
}

