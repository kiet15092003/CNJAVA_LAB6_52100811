package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ApplicationConfiguration {
    @Bean
    @Scope("prototype")
    public Product product1(){
        return new Product("MB01","IPhone",999.99,"Iphone 15 black");
    }
    @Bean
    @Scope("prototype")
    public Product product2(){
        return new Product(product1());
    }
    @Bean
    @Scope("singleton")
    public Product product3(){
        return new Product("MB02","Samsung",988.88,"Samsung galaxy ultra white");
    }
}
