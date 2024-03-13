package com.project.vvnt.site.config;


import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration



@SecurityScheme(
        name = "scheme1",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
@OpenAPIDefinition(

        info = @Info(
                title = "VVnT API ",
                description = "Explore the synergy of innovation and expertise in the backend code developed by Saurabh Maurya for VVnT Organization. Powered by SpringBoot, this code is a testament to precision and excellence, offering a seamless and robust experience. Welcome to the realm of VVnT and Saurabh Maurya's vision, where every line of code reflects dedication, brilliance, and a commitment to unparalleled performance.",
                version = "1.0V",
                contact = @Contact(
                        name = "Saurabh Maurya",
                        email = "saurabhmaurya.in@gmail.com",
                        url = "https://vvnt.netlify.app/"
                ),
                license = @License(
                        name = "OPEN License",
                        url = "https://quikbazaar.netlify.app/"
                )
        )
        ,
        externalDocs = @ExternalDocumentation(
                description = "This is external docs",
                url = "https://github.com/saurabhm1"
        )
)
public class SwaggerConfig {


}
