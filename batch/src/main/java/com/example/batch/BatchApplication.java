package com.example.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class BatchApplication {
//
//	@Autowired
//	public JobBuilderFactory jobBuilderFactory;
//
//	@Autowired
//	public StepBuilderFactory stepBuilderFactory;
//
//	@Bean
//	public Step packageItemStep(){
//		return stepBuilderFactory.get("").tasklet((stepContribution, chunkContext) -> RepeatStatus.FINISHED).build();
//	}

	public static void main(String[] args) {
		SpringApplication.run(BatchApplication.class, args);
	}


}
