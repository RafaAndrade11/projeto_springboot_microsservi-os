/**
 * 
 */
package br.com.randrade.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author rafael.andrade
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.randrade.vendas.online.repository")
public class MongoConfig {

}
