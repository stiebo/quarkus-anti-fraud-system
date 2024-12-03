package dev.stiebo.configuration;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Quarkus Demo: Transaction Service With Fraud Protection",
                version = "0.0.1",
                description = """
                        This is a learning project I built for the JetBrains Academy 'Java Backend Developer' course.
                        It was initially developed with Spring Boot and has now become my first <b>Quarkus</b> application.
                        The 'transfer' took just a few hours using Spring extensions within Quarkus
                        (specifically Spring Web, Spring DI and Spring Data JPA).
                        The project is deployed through Docker using the <b>native image produced with GraalVM
                        </b>. The 'original' project is built with Spring Boot and available here:
                         <a target="_blank" href="https://github.com/stiebo/Anti-Fraud-System">https://github.com/
                        stiebo/Anti-Fraud-System</a>
                        
                        --------------------------------------------------------------------------------------------
                        Project description:
                        Frauds carry significant financial costs and risks for all stakeholders. So, the presence of
                        an anti-fraud system is a necessity for any serious e-commerce platform.
                        
                        The Anti-Fraud System project provides a comprehensive framework for detecting and preventing
                        fraudulent financial transactions. By integrating role-based access control, RESTful APIs,
                        heuristic validation rules, and adaptive feedback mechanisms, the system offers a robust
                        solution for financial institutions to safeguard against fraud.
                        
                        Link to Github repository: <a target="_blank" href="https://github.com/stiebo/quarkus-anti-
                        fraud-system">https://github.com/stiebo/quarkus-anti-fraud-system</a><br/>
                        
                        Check out my Github profile: <a target="_blank" href="https://github.com/stiebo">https://github.
                        com/stiebo</a><br/>
                        
                        Link to the learning project: <a target="_blank" href="https://hyperskill.org/projects/232">
                        https://hyperskill.org/projects/232</a><br/>
                        
                        Check out my learning profile: <a target="_blank" href="https://hyperskill.org/profile/
                        500961738">https://hyperskill.org/profile/500961738</a>
                        """
        )
)
public class AntiFraudApiApplication extends Application {
}
