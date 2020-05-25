#Spring Boot Jokes App With Java Based Configurations
This Spring Boot web application displays a random Chuck Norris joke on the index.

###Java Based Configuration:
This project uses Java Based Spring Configurations. 
For Java based configuration for Spring, we need @Configuration and @Bean annotations.
In this project, they are used in cresclux.springframework.joke.jokeapp.config.ChuckConfiguration

###XML Based Configuration:
Further, to change it to XML based configuration, we can do few changes. Remove @Configuration and 
@Bean annotations from the above mentioned class. 
Create a spring XML configuration file in resources (chuck-config.xml file in this project). 
Add details about the Bean class.
    <bean name="chuckNorrisQuotes" class="guru.springframework.norris.chuck.ChuckNorrisQuotes"></bean>
Next, we need Spring to know where to find the XML configuration file in the classpath.
Therefore, use @ImportResource("classpath:chuck-config.xml") annotation in Spring Boot Application.
Currently, this annotation is commented out because, I wanted to keep the final project as a Java Based 
Configuration project.

The annotations based Spring Configuration project could be found in spring5-jokes-app repository.

