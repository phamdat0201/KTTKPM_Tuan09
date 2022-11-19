package com.example.Retry;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Component
public class RetryService {

	 int index = 0;
	    @Retryable(value = Exception.class, maxAttempts = 10, backoff = @Backoff(delay = 100))
	    void retry() throws Exception {
	        index++;
	        System.out.println("======retry: " + index);
	        throw new Exception(">>>>>>>> Need retry");
	    }

	    @Recover()
	    void recover(Exception ex) {
	        System.out.println("======recover======");
	    }
}
