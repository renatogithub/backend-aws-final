package pe.com.encuesta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClient;

@SpringBootApplication
public class App extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public AWSCognitoIdentityProviderClient CognitoClient() {        
        AWSCognitoIdentityProviderClient cognitoClient = new AWSCognitoIdentityProviderClient(new DefaultAWSCredentialsProviderChain());
		cognitoClient.setRegion(Region.getRegion(Regions.US_EAST_1));
                
        return cognitoClient;
	}

}
