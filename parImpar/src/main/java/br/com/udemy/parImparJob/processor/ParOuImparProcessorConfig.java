package br.com.udemy.parImparJob.processor;

import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParOuImparProcessorConfig {

	@Bean
	public FunctionItemProcessor<Integer, String> parOuImparProcessor() {
		return new FunctionItemProcessor<Integer, String>(
				item -> item % 2 == 0 ? String.format("item %s é par", item) : String.format("item %s é impar", item));
	}

}
