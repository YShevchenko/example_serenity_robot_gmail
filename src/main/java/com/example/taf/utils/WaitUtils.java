package com.example.taf.utils;

import com.jayway.awaitility.core.ConditionFactory;

import static com.jayway.awaitility.Awaitility.with;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class WaitUtils {

    private static final long TIMEOUT = 10000;
    private static final long INTERVAL = 200;

    private WaitUtils() {
    }

    public static ConditionFactory doWait() {
        return with()
                .await()
                .atMost(TIMEOUT, MILLISECONDS)
                .with()
                .pollInterval(INTERVAL, MILLISECONDS);
    }

}
