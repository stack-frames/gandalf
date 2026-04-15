package com.sf.gandalf.designs.ratelimiter;

public class RateLimiter {
     public static void main(String[] args) throws InterruptedException {

            TokenBucketRateLimiter limiter = new TokenBucketRateLimiter(5, 5); // 5 requests/sec

            for (int i = 1; i <= 20; i++) {
                if (limiter.allowRequest()) {
                    System.out.println(i + " → ALLOWED");
                } else {
                    System.out.println(i + " → BLOCKED");
                }
                Thread.sleep(100); // simulate traffic
            }
        }
}
