package br.com.udemy.parImparJob.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImprimeWriterConfig {

	@Bean
	public ItemWriter<String> imprimeWriter() {
		return itens -> itens.forEach(System.out::println);
	}
}
